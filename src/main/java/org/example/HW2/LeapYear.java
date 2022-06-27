package org.example.HW2;

public class LeapYear {
    static boolean isYearLeap (String stringYear) {
        int year;
        try {
            year = Integer.parseInt(stringYear);
        } catch (NumberFormatException e) {
            return false;
        }
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 4 == 0) {
                return year % 100 != 0;
            } else return false;
        }
    }
}
