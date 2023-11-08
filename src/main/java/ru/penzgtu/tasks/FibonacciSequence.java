package ru.penzgtu.tasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FibonacciSequence {
    private static List<Integer> fibonacciSequence = new LinkedList<>(Arrays.asList(0, 1));
    private static int lastEndNumber = 0;

    /**
     * Checking a number for belonging to Fibonacci sequence by approximating Binet's formula.
     *
     * @param number verifiable number.
     * @return {@code true} if the number passes the test.
     */
    public static boolean isFibonacciNumber(int number) {
        if (number < -1) {
            // There is a Fibonacci sequence for negative values of n.
            // It is the same familiar sequence, but each number with odd n becomes negative.
            // But in our case the indices start from zero, so negative will be
            // the numbers with even n.
            List<Integer> fibonacciSequence = generateFibonacciSequence(number * -1);
            return fibonacciSequence.contains(number * -1)
                    && fibonacciSequence.indexOf(number * -1) % 2 == 0;
        }
        // Approximation of the Binet formula.
        return isPerfectSquare(5 * number * number + 4)
                || isPerfectSquare(5 * number * number - 4);
    }

    /**
     * Generating a Fibonacci sequence up to a certain number.
     *
     * @param end number up to which the sequence is generated.
     * @return a list of Fibonacci numbers.
     */
    public static List<Integer> generateFibonacciSequence(int end) {
        if (lastEndNumber >= end) {
            return fibonacciSequence.stream().filter(number -> number <= end).toList();
        }
        lastEndNumber = end;
        for (int i = fibonacciSequence.size();; i++) {
            int statement = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
            if (statement > end) {
                return fibonacciSequence;
            }
            fibonacciSequence.add(statement);
        }
    }

    /**
     *  Checking whether a number is a perfect square.
     *
     * @param number verifiable number.
     * @return {@code true} if the number passes the test.
     */
    private static boolean isPerfectSquare(int number) {
        int square = (int) Math.sqrt(number);
        return (square * square == number);
    }
}
