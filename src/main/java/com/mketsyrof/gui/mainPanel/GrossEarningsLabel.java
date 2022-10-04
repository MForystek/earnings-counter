package com.mketsyrof.gui.mainPanel;

import com.mketsyrof.gui.util.FontConfig;
import com.mketsyrof.logic.EarningsService;

import javax.swing.JLabel;
import java.awt.Color;

public class GrossEarningsLabel extends JLabel {
    private final EarningsService earningsService;

    public GrossEarningsLabel(EarningsService earningsService) {
        super("Gross: " + earningsService.getEarnedToDisplay());
        this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.earningsService = earningsService;
    }

    public void updateEarnings() {
        this.setText("Gross: " + earningsService.getEarnedToDisplay());
    }
}
