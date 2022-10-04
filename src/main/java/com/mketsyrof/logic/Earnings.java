package com.mketsyrof.logic;

public class Earnings {
    private static final int WORKING_HOURS_IN_YEAR = 52 * 40; // weeks in year * hours per week
    private static final int MILLISECONDS_IN_HOUR = 3_600_000;

    private double annualSalary;
    private double earned;
    private String currency;
    private int updateIntervalMillis;

    public Earnings(int updateIntervalMillis) {
        this.updateIntervalMillis = updateIntervalMillis;
        annualSalary = 98_000;
        earned = 0.0;
        currency = "PLN";
    }

    public void update() {
        earned += getMoneyPerSecond();
    }

    public void reset() {
        earned = 0.0;
    }

    public double getMoneyPerSecond() {
        return annualSalary / WORKING_HOURS_IN_YEAR / MILLISECONDS_IN_HOUR * updateIntervalMillis;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getEarned() {
        return earned;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
