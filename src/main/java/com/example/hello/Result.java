/**
 * Class that implements the FizzBuzz challenge.
 */
package com.example.hello;

public class Result {
    /**
     * Solves the FizzBuzz challenge:
     * - Prints numbers from 1 to n
     * - For multiples of 3, prints "Fizz" instead of the number
     * - For multiples of 5, prints "Buzz" instead of the number
     * - For multiples of both 3 and 5, prints "FizzBuzz" instead of the number
     *
     * @param n The upper limit of numbers to process
     */
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}