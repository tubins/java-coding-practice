package com.tubz.string;

import java.util.HashSet;
import java.util.Set;

/**
 * O(n), O(1)
 */
public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        String input = "abcdbegbehef";
        System.out.println(findLongestSubstringWithoutRepeating(input));
    }

    private static int findLongestSubstringWithoutRepeating(final String input) {
        int maxLength = 0;
        int start = 0;
        int[] indexes = new int[128]; // 128 chars
        for (int i = 0; i < 128; i++) {
            indexes[i] = -1;
        }
        for (int i = 0; i < input.length(); i++) {
            if (indexes[input.charAt(i)] >= start) {
                start = indexes[input.charAt(i)] + 1;
            }
            indexes[input.charAt(i)] = i;
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
