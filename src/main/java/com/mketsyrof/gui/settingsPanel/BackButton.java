package com.mketsyrof.gui.settingsPanel;

import com.mketsyrof.gui.util.FontConfig;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Insets;

public class BackButton extends JButton {
    public BackButton(JFrame settingsFrame) {
        super();
        this.setText("Back");
        this.setMargin(new Insets(0, 5, 0, 5));
        this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFocusable(false);
        this.addActionListener(e -> settingsFrame.setVisible(false));
    }
}

