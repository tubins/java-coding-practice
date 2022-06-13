package com.tubz.string;

import java.util.HashSet;
import java.util.Set;

/**
 * O(n), O(n)
 */
public class FirstRepeatingChar {

    public static void main(String[] args) {
        String input = "Malayalam is my language";
        System.out.println(findFirstRepeatingChar(input));
    }

    private static char findFirstRepeatingChar(final String input) {
        Set<Character> alreadyVisitedChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (alreadyVisitedChars.contains(c)) {
                return c;
            }
            alreadyVisitedChars.add(c);
        }
        return '\0';
    }
}
