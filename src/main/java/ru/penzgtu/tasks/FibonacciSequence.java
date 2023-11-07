package ru.penzgtu.tasks;

import java.util.List;
import java.util.stream.Stream;

public class FibonacciSequence {
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
        return Stream.iterate(new int[]{0, 1}, numbers -> numbers[0] <= end,
                numbers -> new int[]{numbers[1], numbers[0] + numbers[1]})
                .map(array -> array[0])
                .toList();
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
