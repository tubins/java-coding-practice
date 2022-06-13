package com.tubz.other;

public class Factorial {
    public static int factorial(final int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static int recursiveFactorial(final int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(recursiveFactorial(5));
    }
}
