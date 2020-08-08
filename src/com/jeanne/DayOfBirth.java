package com.jeanne;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DayOfBirth {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1992, Month.APRIL, 28);
        System.out.println(dob.getDayOfYear());
        LocalDate now = LocalDate.now();
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    }
}
