package com.mketsyrof.logic;

public class Earnings {
    private static final int WEEKS_IN_YEAR = 52;
    private static final int MILLISECONDS_IN_HOUR = 3_600_000;

    private double annualSalary;
    private int workHoursPerYear;
    private String currency;
    private double earned;
    private int updateIntervalInMillis;

    public Earnings(int updateIntervalInMillis, int annualSalary, int workHoursPerWeek, String currency) {
        this.updateIntervalInMillis = updateIntervalInMillis;
        this.workHoursPerYear = workHoursPerWeek * WEEKS_IN_YEAR;
        this.annualSalary = annualSalary;
        this.currency = currency;
    }

    public void update() {
        earned += getMoneyPerSecond();
    }

    public void reset() {
        earned = 0.0;
    }

    public double getMoneyPerSecond() {
        return annualSalary / workHoursPerYear / MILLISECONDS_IN_HOUR * updateIntervalInMillis;
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
