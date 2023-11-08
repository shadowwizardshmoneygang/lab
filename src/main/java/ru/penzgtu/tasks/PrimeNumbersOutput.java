package ru.penzgtu.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumbersOutput implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Prime numbers output");
        List<Integer> numbers = RandomNumber.generateList();
        System.out.print(
                numbers.stream()
                        .filter(this::isPrime)
                        .map(number -> Integer.toString(number))
                        .collect(Collectors.joining(", ", "Prime numbers: ", ".\n"))
        );
    }

    /**
     * Checking a number for prime.
     *
     * @param number verifiable number.
     * @return {@code true} if the number passes the test.
     */
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.round(Math.sqrt(number)); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}