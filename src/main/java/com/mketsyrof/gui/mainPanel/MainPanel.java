package com.mketsyrof.gui.mainPanel;

import com.mketsyrof.logic.EarningsService;
import com.mketsyrof.logic.SavedSettings;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class MainPanel extends JPanel {
    private static final int UPDATE_INTERVAL_IN_MILLIS = 100;

    private final GrossEarningsLabel grossEarningsLabel;
    private final EarningsTimeLabel earningsTimeLabel;
    private final JButton settingsButton;
    private final JButton resetButton;
    private final JButton exitButton;
    private final Timer updater;

    private SavedSettings savedSettings;

    public MainPanel() {
        savedSettings = new SavedSettings();
        EarningsService earningsService = new EarningsService(UPDATE_INTERVAL_IN_MILLIS, savedSettings.getAnnualSalary(), savedSettings.getWorkHoursInWeek(), savedSettings.getCurrency());

        grossEarningsLabel = new GrossEarningsLabel(earningsService);
        earningsTimeLabel = new EarningsTimeLabel(earningsService);
        settingsButton = new SettingsButton();
        resetButton = new ResetButton(earningsService);
        exitButton = new ExitButton();

        GridBagLayout gridBagLayout = new GridBagLayout();
        this.setLayout(gridBagLayout);
        this.setBackground(Color.BLACK);

        populateMainPanel();

        updater = new Timer(UPDATE_INTERVAL_IN_MILLIS, e -> update());
        updater.start();
    }

    private void populateMainPanel() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.VERTICAL;

        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(grossEarningsLabel, gbc);

        gbc.gridy = 1;
        gbc.ipady = 20;
        this.add(earningsTimeLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.ipady = 10;
        this.add(resetButton, gbc);

        gbc.gridx = 1;
        this.add(settingsButton, gbc);

        gbc.gridx = 2;
        this.add(exitButton, gbc);
    }

    private void update() {
        grossEarningsLabel.updateEarnings();
        earningsTimeLabel.updateEarningsTime();
    }

    public GrossEarningsLabel getGrossEarningsLabel() {
        return grossEarningsLabel;
    }

    public EarningsTimeLabel getEarningsTimeLabel() {
        return earningsTimeLabel;
    }
}
