package com.mketsyrof.gui;

import com.mketsyrof.logic.EarningsService;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private final EarningsLabel earningsLabel;
    private final EarningsTimeLabel earningsTimeLabel;
    private final JButton exitButton;

    private final Timer updater;

    public MainPanel() {
        int updateIntervalMillis = 100;
        EarningsService earningsService = new EarningsService(updateIntervalMillis);

        earningsLabel = new EarningsLabel(earningsService);
        earningsTimeLabel = new EarningsTimeLabel(earningsService);
        exitButton = new ExitButton();

        GridBagLayout gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);
        this.setBackground(Color.BLACK);

        populateMainPanel();

        updater = new Timer(updateIntervalMillis, e -> update());
        updater.start();
    }

    private void populateMainPanel() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.VERTICAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(earningsLabel, gbc);

        gbc.gridy = 1;
        gbc.ipady = 20;
        this.add(earningsTimeLabel, gbc);

        gbc.gridy = 2;
        this.add(exitButton, gbc);
    }

    private void update() {
        earningsLabel.updateEarnings();
        earningsTimeLabel.updateEarningsTime();
    }

    public EarningsLabel getEarningsLabel() {
        return earningsLabel;
    }

    public EarningsTimeLabel getEarningsTimeLabel() {
        return earningsTimeLabel;
    }
}
