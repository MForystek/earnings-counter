package com.mketsyrof.logic;

public class SimpleTimer {
    long elapsedMillis;
    int updateIntervalMillis;

    public SimpleTimer(int updateIntervalInMillis) {
        this.updateIntervalMillis = updateIntervalInMillis;
    }

    @Override
    public String toString() {
        String displayFormat = "%02d:%02d:%02d.%d";
        return String.format(displayFormat, getHoursToDisplay(), getMinutesToDisplay(), getSecondsToDisplay(), getMillisToDisplay());
    }

    public void update() {
        elapsedMillis += updateIntervalMillis;
    }

    public void reset() {
        elapsedMillis = 0;
    }

    public long getElapsedMillis() {
        return elapsedMillis;
    }

    public long getMillisToDisplay() {
        return getElapsedMillis() % 1000 / updateIntervalMillis;
    }

    public long getElapsedSeconds() {
        return getElapsedMillis() / 1000;
    }

    public long getSecondsToDisplay() {
        return getElapsedSeconds() % 60;
    }

    public long getElapsedMinutes() {
        return getElapsedSeconds() / 60;
    }

    public long getMinutesToDisplay() {
        return getElapsedMinutes() % 60;
    }

    public long getElapsedHours() {
        return getElapsedMinutes() / 60;
    }

    public long getHoursToDisplay() {
        return getElapsedHours();
    }
}
