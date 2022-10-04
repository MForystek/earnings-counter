package com.mketsyrof;

import com.mketsyrof.gui.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    private static final String TITLE = "Earnings counter";

    private static JFrame mainFrame;

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        JPanel mainPanel = new MainPanel();
        mainFrame = new JFrame();

        setFrameSizeWithRation(240, 12, 10);
        mainFrame.setTitle(TITLE);
        mainFrame.setContentPane(mainPanel);
        mainFrame.setVisible(true);
    }

    private static void setFrameSizeWithRation(int heightValue, int widthRatio, int heightRatio) {
        int widthValue = heightValue * widthRatio / heightRatio;
        mainFrame.setSize(widthValue, heightValue);
    }
}