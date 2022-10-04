package com.mketsyrof.logic;

import java.time.Instant;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EarningsService {
    private Earnings earnings;
    private SimpleTimer simpleTimer;
    private Timer earningsUpdater;

    public EarningsService(int updateIntervalInMillis, int annualSalary, int workingHoursInWeek, String currency) {
        earnings = new Earnings(updateIntervalInMillis, annualSalary, workingHoursInWeek, currency);
        simpleTimer = new SimpleTimer(updateIntervalInMillis);
        earningsUpdater = new Timer("earningsUpdater");
        earningsUpdater.schedule(createEarningsUpdaterTimerTask(), Date.from(Instant.now()), updateIntervalInMillis);
    }

    private TimerTask createEarningsUpdaterTimerTask() {
        return new TimerTask() {
            @Override
            public void run() {
                update();
            }
        };
    }

    public void update() {
        earnings.update();
        simpleTimer.update();
    }

    public String getEarnedToDisplay() {
        String earningsToDisplay = String.format("%.2f", earnings.getEarned());
        return earningsToDisplay + " " + earnings.getCurrency();
    }

    public String getTimePassed() {
        return simpleTimer.toString();
    }

    public void reset() {
        simpleTimer.reset();
        earnings.reset();
    }

    public Earnings getEarnings() {
        return earnings;
    }
}
