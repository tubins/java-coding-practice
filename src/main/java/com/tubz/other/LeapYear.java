package com.tubz.other;

public class LeapYear {

    public static boolean isEvenlyDivisibleByParam(int number, int param) {
        return number % param == 0;
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return isEvenlyDivisibleByParam(year, 4) &&
                isEvenlyDivisibleByParam(year, 100) &&
                isEvenlyDivisibleByParam(year, 400);
    }
}
