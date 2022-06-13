package com.tubz.other;

import java.util.Arrays;
import java.util.HashSet;

public class TargetFinder {
    public static boolean findNumbers(final int[] numbers, int target) {

        var visitedNumbers = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            int requiredNumber = target -  numbers[i];
            if(visitedNumbers.contains(requiredNumber)) {
                return true;
            } else {
                visitedNumbers.add(numbers[i]);
            }
        }

        return false;
    }




    public static void main(String[] args) {
        int[] numArray = new int[]{30, 20, 14, 18, 17};
        int target = 32;
        System.out.println(String.format("check for the target number %s in  %s is %s", target, Arrays.toString(numArray), findNumbers(numArray, target)));

    }
}
