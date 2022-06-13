package com.tubz.other;

public class SpeedConverterMain {
    public static void main(String[] args) {
        SpeedConverter.printConvertion(100);

        System.out.println("Non leap year");
        System.out.println(LeapYear.isLeapYear(1700));
        System.out.println(LeapYear.isLeapYear(1800));
        System.out.println(LeapYear.isLeapYear(1900));
        System.out.println(LeapYear.isLeapYear(2100));
        System.out.println(LeapYear.isLeapYear(2200));
        System.out.println(LeapYear.isLeapYear(2300));
        System.out.println(LeapYear.isLeapYear(2500));
        System.out.println(LeapYear.isLeapYear(2600));


        System.out.println("Leap year");
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2000));
        System.out.println(LeapYear.isLeapYear(2400));


    }
}
