package com.tubz.other;

public class ReverseAString {

    public static void main(String[] args) {
        String input = "this is a string to reverse - malayalam";
        System.out.println("reverse using builder - " + new StringBuilder(input).reverse());

        System.out.println("reverse using loop -" + reverseString(input));
    }


    public static String reverseString(final String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}
