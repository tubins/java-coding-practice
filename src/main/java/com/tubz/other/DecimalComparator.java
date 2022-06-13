package com.tubz.other;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double paramOne, double paramTwo) {
        return (int) (paramOne * 1000) == (int) (paramTwo * 1000);
    }
}
