package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.ColorModel;

public class DisplayFeature {


    public static void setDisMode() {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDevice graphics = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getDefaultScreenDevice();
        graphics.setDisplayMode(new DisplayMode(800, 600, 32, 60));
        frame.setVisible(true);
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_STATE_CHANGED));
        frame.getLayout();

            }
}









