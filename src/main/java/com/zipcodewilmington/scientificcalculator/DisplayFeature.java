package com.zipcodewilmington.scientificcalculator;

import java.awt.*;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.util.Locale;

public class DisplayFeature {

    public static void main(String[] args) {

            GraphicsEnvironment x = new GraphicsEnvironment() {
                @Override
                public GraphicsDevice[] getScreenDevices() throws HeadlessException {
                    return new GraphicsDevice[0];
                }

                @Override
                public GraphicsDevice getDefaultScreenDevice() throws HeadlessException {
                    return null;
                }

                @Override
                public Graphics2D createGraphics(BufferedImage img) {
                    return null;
                }

                @Override
                public Font[] getAllFonts() {
                    return new Font[0];
                }

                @Override
                public String[] getAvailableFontFamilyNames() {
                    return new String[0];
                }

                @Override
                public String[] getAvailableFontFamilyNames(Locale l) {
                    return new String[0];
                }
            };


        }

    }





