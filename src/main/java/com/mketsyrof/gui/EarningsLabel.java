package com.mketsyrof.gui;

import com.mketsyrof.gui.util.FontConfig;
import com.mketsyrof.logic.EarningsService;

import javax.swing.*;
import java.awt.*;

public class EarningsLabel extends JLabel {
    private final EarningsService earningsService;

    public EarningsLabel(EarningsService earningsService) {
        super(earningsService.getEarnedToDisplay());

        this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
        this.setForeground(Color.WHITE);
        this.earningsService = earningsService;
    }

    public void updateEarnings() {
        this.setText(earningsService.getEarnedToDisplay());
    }
}
