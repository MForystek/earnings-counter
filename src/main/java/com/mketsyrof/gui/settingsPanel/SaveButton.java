package com.mketsyrof.gui.settingsPanel;

import com.mketsyrof.gui.util.FontConfig;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Insets;

public class SaveButton extends JButton {
    public SaveButton() {
        super();
        this.setText("Save");
        this.setMargin(new Insets(0, 5, 0, 5));
        this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFocusable(false);
        this.addActionListener(e -> {
            //TODO make it save settings
        });
    }
}
