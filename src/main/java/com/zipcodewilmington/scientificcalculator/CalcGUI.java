package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class CalcGUI extends ScientificCalc {
    private JFrame frame;
    private JTextField field;
    private double tmp1, tmp2, result;
    private String operation;
    private Boolean flagOverwrite;
    private Boolean flagHasOverwritten;
    private Boolean operatorLastInput;

    public CalcGUI() {
        super();
        tmp1 = 0;
        tmp2 = 0;
        result = 0;
        operation = "";
        flagOverwrite = false;
        flagHasOverwritten = false;
        operatorLastInput = false;
        init();
    }

    private void init() {
        // init frame
        frame = new JFrame("Zip Calc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 600));
        frame.setBackground(new Color(239, 232, 232));

        // init field
        this.field = new JTextField();
        field.setPreferredSize(new Dimension(400, 80));
        field.setText("");
        field.setEditable(false);
        frame.add(field, BorderLayout.NORTH);
        //=========================== Number pad panel =========================
        // number panel
        JPanel calcPanel = new JPanel();
        //calcPanel.setPreferredSize(new Dimension(200, 200));
        calcPanel.setLayout(new GridLayout(7, 3));

        Action opActionListener = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String op = button.getText();
                if (op.equals("xʸ")) {
                    op = "pow";
                }
                if (operatorLastInput) {
                    operation = op;
                    operatorLastInput = true;
                    return;
                } else if (operation != "") {
                    tmp1 = handleOperation(operation, tmp1, Double.valueOf(field.getText()));
                    field.setText(String.valueOf(tmp1));
                } else {
                    tmp1 = Double.valueOf(field.getText());
                }
                operation = op;
                operatorLastInput = true;
                flagOverwrite = true;
                flagHasOverwritten = false;
            }
        };

        JButton bMPlus = new JButton("M+");
        bMPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMemory(addition(getMemory(), Double.valueOf(field.getText())));
            }
        });
        JButton bMC = new JButton("MC");
        bMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMemory(0);
            }
        });
        JButton bMRC = new JButton("MRC");
        bMRC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(String.valueOf(getMemory()));
            }
        });
        JButton bSquare = new JButton("x²");
        bSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(squared(x)));
            }
        });
        JButton bSRoot = new JButton("√x");
        bSRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(squareRoot(x)));
            }
        });
        JButton bClear = new JButton("C");
        bClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText("0");
                tmp1= 0;
                tmp2= 0;
                operation = "";
                result = 0;
                flagHasOverwritten = false;
                flagOverwrite = true;
            }
        });
        JButton bExpo = new JButton("xʸ");
        bExpo.addActionListener(opActionListener);
        // Division by 0 possible!
        JButton bInv = new JButton("1/x");
        bInv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(inverse(x)));
            }
        });
        JButton bAbs = new JButton("|x|");
        bAbs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(abs(x)));
            }
        });

        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton bDot = new JButton(".");
        bDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fieldTxt = field.getText();
                if (!fieldTxt.contains(".")) {
                    field.setText(fieldTxt.concat("."));
                }
            }
        });
        JButton bPlusMinus = new JButton("+/-");
        bPlusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(invert(x)));
            }
        });

        calcPanel.add(bMPlus);
        calcPanel.add(bMC);
        calcPanel.add(bMRC);
        calcPanel.add(bSquare);
        calcPanel.add(bSRoot);
        calcPanel.add(bClear);
        calcPanel.add(bExpo);
        calcPanel.add(bInv);
        calcPanel.add(bAbs);
        calcPanel.add(b7);
        calcPanel.add(b8);
        calcPanel.add(b9);
        calcPanel.add(b4);
        calcPanel.add(b5);
        calcPanel.add(b6);
        calcPanel.add(b1);
        calcPanel.add(b2);
        calcPanel.add(b3);
        calcPanel.add(bPlusMinus);
        calcPanel.add(b0);
        calcPanel.add(bDot);


        // ======================== Operator/Right panel ======================
        JPanel opPanel = new JPanel();
        //opPanel.setPreferredSize(new Dimension(70, 200));
        opPanel.setLayout(new GridLayout(7, 1));

        JButton bDiv = new JButton("÷");
        JButton bMul = new JButton("x");
        JButton bMinus = new JButton("-");
        JButton bPlus = new JButton("+");
        JButton bEqual = new JButton("=");
        JButton bMod = new JButton("mod");
        JButton bBackSpace = new JButton("←");
        bBackSpace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = field.getText();
                if (txt.length() == 1) {
                    field.setText("0");
                    flagOverwrite = true;
                    flagHasOverwritten = false;
                } else if (txt.charAt(txt.length() - 2) == '.') {
                    field.setText(txt.substring(0, txt.length() - 2));
                } else {
                    field.setText(txt.substring(0, txt.length() - 1));
                }
            }
        });
        // listener for number pad buttons
        Action numActionListener = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                if (flagOverwrite && !flagHasOverwritten) {
                    field.setText(button.getText());
                    flagHasOverwritten = true;
                } else {
                    field.setText(field.getText().concat(button.getText()));
                }
                operatorLastInput = false;
            }
        };

        b0.addActionListener(numActionListener);
        b1.addActionListener(numActionListener);
        b2.addActionListener(numActionListener);
        b3.addActionListener(numActionListener);
        b4.addActionListener(numActionListener);
        b5.addActionListener(numActionListener);
        b6.addActionListener(numActionListener);
        b7.addActionListener(numActionListener);
        b8.addActionListener(numActionListener);
        b9.addActionListener(numActionListener);
        bDiv.addActionListener(opActionListener);
        bPlus.addActionListener(opActionListener);
        bMinus.addActionListener(opActionListener);
        bMod.addActionListener(opActionListener);
        bMul.addActionListener(opActionListener);
        bEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tmp2 = Double.valueOf(field.getText());
                switch (operation) {
                    case "+":
                        result = addition(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                        break;
                    case "-":
                        result = subtraction(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                        break;
                    case "÷":
                        result = division(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                        break;
                    case "x":
                        result = multiplication(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                        break;
                    case "mod":
                        result = tmp1 % tmp2;
                        field.setText(String.valueOf(result));
                        break;
                    case "pow":
                        result = exponent(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                }
                // reset operation and flag
                operation = "";
                flagOverwrite = true;
                flagHasOverwritten = false;
            }
        });



        opPanel.add(bBackSpace);
        opPanel.add(bMod);
        opPanel.add(bDiv);
        opPanel.add(bMul);
        opPanel.add(bMinus);
        opPanel.add(bPlus);
        opPanel.add(bEqual);

        // ==================== Left Panel ==========================
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(7, 2));

        JButton bLog = new JButton("Log");
        bLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(log(x)));
            }
        });
        JButton bILog = new JButton("10ˣ");
        bILog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(invLog(x)));
            }
        });
        JButton bINatLog = new JButton("eˣ");
        bINatLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(invNatLog(x)));
            }
        });
        JButton bNatLog = new JButton("Ln");
        bNatLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(natLog(x)));
            }
        });
        JButton bFactorial = new JButton("x!");
        bFactorial.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(factorial(x)));
            }
        });
        JButton bSin = new JButton("sin");
        bSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(sin(x)));
            }
        });
        JButton bCos = new JButton("cos");
        bCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(cos(x)));
            }
        });
        JButton bTan = new JButton("tan");
        bTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(tan(x)));
            }
        });
        JButton bISin = new JButton("sin⁻¹");
        bISin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(invSin(x)));
            }
        });
        JButton bITan = new JButton("tan⁻¹");
        bITan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(invTan(x)));
            }
        });
        JButton bICos = new JButton("cos⁻¹");
        bICos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.valueOf(field.getText());
                field.setText(String.valueOf(invCos(x)));
            }
        });
        JButton bDisplayMode = new JButton("Dec");
        bDisplayMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchDisplayMode();
                bDisplayMode.setText(getDisplayMode());
            }
        });
        JButton bTrigMode = new JButton("Deg");
        bTrigMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchUnitsMode();
                bTrigMode.setText(TrigUnit.valueOf(getTrigMode()).getAbbrev());
            }
        });
        JButton bPi = new JButton("π");
        bPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                field.setText(String.valueOf(Math.PI));
            }
        });

        leftPanel.add(bLog);
        leftPanel.add(bILog);
        leftPanel.add(bINatLog);
        leftPanel.add(bNatLog);
        leftPanel.add(bFactorial);
        leftPanel.add(bSin);
        leftPanel.add(bCos);
        leftPanel.add(bTan);
        leftPanel.add(bISin);
        leftPanel.add(bITan);
        leftPanel.add(bICos);
        leftPanel.add(bDisplayMode);
        leftPanel.add(bTrigMode);
        leftPanel.add(bPi);
        //==================================================================



        frame.add(calcPanel);
        frame.add(opPanel, BorderLayout.EAST);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);


    }

    private double handleOperation(String operation, double x, double y) {
        switch (operation) {
            case "+":
                return addition(x, y);
            case "-":
                return subtraction(x, y);
            case "÷":
                return division(x, y);
            case "x":
                return multiplication(x, y);
            case "mod":
                return x % y;
            case "pow":
                return exponent(x, y);
            default:
                return 0;
        }
    }
}

