package com.mketsyrof.gui.mainPanel;

import com.mketsyrof.gui.util.FontConfig;
import com.mketsyrof.logic.EarningsService;

import javax.swing.JLabel;
import java.awt.Color;

public class EarningsTimeLabel extends JLabel {
    private EarningsService earningsService;

    public EarningsTimeLabel(EarningsService earningsService) {
        super("Time: " + earningsService.getTimePassed());

        this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
        this.setForeground(Color.WHITE);
        this.earningsService = earningsService;
    }

    public void updateEarningsTime() {
        this.setText("Time: " + earningsService.getTimePassed());
    }
}
