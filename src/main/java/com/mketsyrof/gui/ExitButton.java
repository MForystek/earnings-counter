package com.mketsyrof.gui;

import com.mketsyrof.gui.util.FontConfig;

import javax.swing.*;
import java.awt.*;

public class ExitButton extends JButton {
    public ExitButton() {
        super();

        this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
        this.setText("Exit");
        this.setBackground(Color.BLACK);
        //this.setForeground(Color.WHITE);
        this.setFocusable(false);
        this.addActionListener(e -> System.exit(0));
    }
}
