package com.mketsyrof.gui;

import com.mketsyrof.gui.util.FontConfig;
import com.mketsyrof.logic.EarningsService;

import javax.swing.*;
import java.awt.*;

public class EarningsTimeLabel extends JLabel {
    private EarningsService earningsService;

    public EarningsTimeLabel(EarningsService earningsService) {
        super("Earned within " + earningsService.getTimePassed());

        this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
        this.setForeground(Color.WHITE);
        this.earningsService = earningsService;
    }

    public void updateEarningsTime() {
        this.setText(earningsService.getTimePassed());
    }
}
