package com.tubz.array;

import java.util.HashSet;
import java.util.Set;

/**
 * O(n), O(1)
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 48, 1, 7, -5, 7, 2, 4};
        System.out.println(maximumSubarray(arr));
    }

    static int maximumSubarray(int[] arr) {
        int globalSum = Integer.MIN_VALUE;
        int localSum = 0;
        for (int element : arr) {
            localSum = Math.max(element, localSum + element);
            globalSum = Math.max(globalSum, localSum);
        }
        return globalSum;
    }
}
