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
    private Boolean hasDecimal;
    private Boolean flagOverwrite;

    public CalcGUI() {
        super();
        tmp1 = 0;
        tmp2 = 0;
        result = 0;
        operation = "";
        hasDecimal = false;
        flagOverwrite = false;
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


        JButton bMPlus = new JButton("M+");
        JButton bMC = new JButton("MC");
        JButton bMRC = new JButton("MRC");
        JButton bSquare = new JButton("x²");
        JButton bSRoot = new JButton("√x");
        JButton bClear = new JButton("C");
        JButton bExpo = new JButton("xʸ");
        JButton bInv = new JButton("1/x");
        JButton bAbs = new JButton("|x|");

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
        JButton bPlusMinus = new JButton("+/-");

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
        JButton bILog = new JButton("10ˣ");
        JButton bINatLog = new JButton("eˣ");
        JButton bNatLog = new JButton("Ln");
        JButton bFactorial = new JButton("x!");
        JButton bSin = new JButton("sin");
        JButton bCos = new JButton("cos");
        JButton bTan = new JButton("tan");
        JButton bISin = new JButton("sin⁻¹");
        JButton bITan = new JButton("tan⁻¹");
        JButton bICos = new JButton("cos⁻¹");
        JButton bDisplayMode = new JButton("Dec");
        JButton bTrigMode = new JButton("Deg");
        JButton bPi = new JButton("π");

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
        // listener for number pad buttons
        Action numActionListener = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                if (!flagOverwrite) {
                    field.setText(field.getText().concat(button.getText()));
                } else {
                    field.setText(button.getText());
                }
            }
        };
        // listener for operator buttons
        Action opActionListener = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String op = button.getText();
                if (operation != "") {
                    tmp1 = handleOperation(operation, tmp1, Double.valueOf(field.getText()));
                    field.setText(String.valueOf(tmp1));
                } else {
                    tmp1 = Double.valueOf(field.getText());
                }
                operation = op;
                flagOverwrite = true;
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
                switch (operation) {
                    case "+":
                        tmp2 = Double.valueOf(field.getText());
                        result = addition(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                        break;
                    case "-":
                        tmp2 = Double.valueOf(field.getText());
                        result = subtraction(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                        break;
                    case "÷":
                        tmp2 = Double.valueOf(field.getText());
                        result = division(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                        break;
                    case "x":
                        tmp2 = Double.valueOf(field.getText());
                        result = multiplication(tmp1, tmp2);
                        field.setText(String.valueOf(result));
                        break;
                    case "mod":
                        tmp2 = Double.valueOf(field.getText());
                        result = tmp1 % tmp2;
                        field.setText(String.valueOf(result));
                }
            }
        });


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
                return subtraction(tmp1, tmp2);
            case "÷":
                return division(tmp1, tmp2);
            case "x":
                return multiplication(tmp1, tmp2);
            case "mod":
                return tmp1 % tmp2;
            default:
                return 0;
        }
    }
}

