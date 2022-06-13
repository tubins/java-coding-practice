package com.tubz.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * O(n), O(n)
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 48, 1, 7, -5, 7, 2, 4};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }

    private static int[] removeDuplicate(int[] arr) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i : arr) {
            uniqueValues.add(i);
        }
        return uniqueValues.stream().mapToInt(Integer::intValue).toArray();
    }


}
