package com.tubz.array;

import java.util.HashSet;
import java.util.Set;

/**
 * O(n), O(n)
 */
public class FindTheDuplicate {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 48, 1, 7, -5, 7, 2, 4};
        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i : arr) {
            if(uniqueValues.contains(i)) {
                return i;
            }
            uniqueValues.add(i);
        }
        return -1;
    }


}
