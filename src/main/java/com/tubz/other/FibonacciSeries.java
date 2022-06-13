package com.tubz.other;

public class FibonacciSeries {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, fib, limit = 15;

        System.out.print(num1 + " " + num2);

        for (int i = 0; i < limit; i++) {
            fib = num1 + num2;
            System.out.print(" " + fib + " ");
            num1 = num2;
            num2 = fib;
        }
    }
}
