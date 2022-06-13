package com.tubz.string;

/**
 * Given a string str made of alphabetical letters only, create a function that returns the length of the longest
 * palindrome string that can be made from letters of str.
 *
 * <strong>Example 1:</strong>
 *
 * <p>Input: str = "abbaba"</p>
 * <p>Output: 5</p>
 * <p>
 * Explanation: one of the longest palindromes that can be made is "baaab", its length is 5
 *
 * <strong>Example 2:</strong>
 *
 * <p>Input: str = "abbaaa"</p>
 *
 * <p>Output: 6</p>
 * <p>
 * Explanation: one of the longest palindromes that can be made is "baaaab", its length is 6
 *
 * <strong>Example 3:</strong>
 *
 * <p>Input: str = "abbabab"</p>
 *
 * <p>Output: 7</p>
 * <p>
 * Explanation: one of the longest palindromes that can be made is "bbaaabb", its length is 7
 * <p>
 * <p>
 * O(n), O(1)
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ababbaab"));
    }


    public static int longestPalindrome(String input) {
        int[] occurrences = new int[128]; // Capital letter case representation of ASCII is from 65 to 90 and small case is 97 to 122

        for (char letter : input.toCharArray()) {
            occurrences[letter]++;
        }
        int length = 0;
        for (int occur : occurrences) {
            length += occur % 2 == 0 ? occur : occur - 1;
        }
        return length;
    }
}
