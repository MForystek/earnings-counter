package com.mketsyrof.logic;

import java.util.prefs.Preferences;

public class SavedSettings {
   private static final String ANNUAL_SALARY = "annualSalary";
   private static final String WORK_HOURS_IN_WEEK = "workHoursInWeek";
   private static final String CURRENCY = "currency";

   private static final int DEFAULT_ANNUAL_SALARY = 125_000;
   private static final int DEFAULT_WORK_HOURS_IN_WEEK = 40;
   private static final String DEFAULT_CURRENCY = "PLN";

   private final Preferences preferences;

   public SavedSettings() {
      preferences = Preferences.userNodeForPackage(com.mketsyrof.Main.class);
   }
   public int getAnnualSalary() {
      return preferences.getInt(ANNUAL_SALARY, DEFAULT_ANNUAL_SALARY);
   }

   public void setAnnualSalary(int annualSalary) {
      if (annualSalary <= 0) throw new NumberFormatException("Salary cannot be smaller than or equal to 0");
      preferences.putInt(ANNUAL_SALARY, annualSalary);
   }
   public int getWorkHoursInWeek() {
      return preferences.getInt(WORK_HOURS_IN_WEEK, DEFAULT_WORK_HOURS_IN_WEEK);
   }

   public void setWorkHoursInWeek(int workHoursInWeek) {
      if (workHoursInWeek <= 0) throw new NumberFormatException("Salary cannot be smaller than or equal to 0");
      preferences.putInt(WORK_HOURS_IN_WEEK, workHoursInWeek);
   }
   public String getCurrency() {
      return preferences.get(CURRENCY, DEFAULT_CURRENCY);
   }

   public void setCurrency(String currency) {
      preferences.put(CURRENCY, currency);
   }
}
