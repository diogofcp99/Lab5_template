package com.pa.refactoring.model;

import java.time.LocalDateTime;

public class Time {
    private int day, month, year, minute, hour;

    public Time(){
        LocalDateTime d = LocalDateTime.now();
        this.day = d.getDayOfMonth();
        this.month = d.getMonthValue();
        this.year = d.getYear();
        this.hour = d.getHour();
        this.minute = d.getMinute();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }
}
