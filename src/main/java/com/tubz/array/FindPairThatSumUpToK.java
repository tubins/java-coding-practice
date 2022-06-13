package com.tubz.array;

import java.util.HashSet;
import java.util.Set;

/**
 * O(n), O(n)
 */
public class FindPairThatSumUpToK {

    public static boolean checkPair(int[] arr, int k) {
        Set<Integer> alreadyVisited = new HashSet<>();
        for (int i : arr) {
            if (alreadyVisited.contains(k - i)) {
                return true;
            }
            alreadyVisited.add(i);
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 1, -1, 3, 4};
        int k = 11;
        System.out.println(checkPair(arr, k));
    }

}
