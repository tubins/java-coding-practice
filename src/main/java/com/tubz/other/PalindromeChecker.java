package com.tubz.other;

import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(final String input) {
        if(input == null) {
            return false;
        }
        return new StringBuffer(input).reverse().toString().equalsIgnoreCase(input);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string : ");
        String input = scanner.nextLine();
        System.out.println(isPalindrome(input));
    }
}
