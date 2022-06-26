package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import javax.xml.crypto.dsig.spec.DigestMethodParameterSpec;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class CalcGUI  {
    private JFrame frame;
    private JTextField field;

    public CalcGUI() {
        init();
    }
    private void init() {
        // init frame
        frame = new JFrame("Zip Calc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400,600));
        frame.setBackground(new Color(239, 232, 232));

        // init field
        JTextField field = new JTextField();
        field.setPreferredSize(new Dimension(400, 80));
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


        // ======================== Operator panel ======================
        JPanel opPanel = new JPanel();
        //opPanel.setPreferredSize(new Dimension(70, 200));
        opPanel.setLayout(new GridLayout(7, 1));


        JButton bDiv = new JButton("÷");
        JButton bMul = new JButton("x");
        JButton bMinus = new JButton("-");
        JButton bPlus = new JButton("+");
        JButton bEqual = new JButton("=");
        JButton bMod = new JButton("Mod");
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

        frame.add(calcPanel);
        frame.add(opPanel, BorderLayout.EAST);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.pack();
        frame.setVisible(true);


    }


}

