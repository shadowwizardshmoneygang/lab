package ru.penzgtu.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class FibonacciNumbersOutput implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Fibonacci numbers output");
        List<Integer> numbers = RandomNumber.generateList();
        System.out.print(
                numbers.stream()
                        .filter(FibonacciSequence::isFibonacciNumber)
                        .map(number -> Integer.toString(number))
                        .collect(Collectors.joining(", ", "Fibonacci numbers: ", ".\n"))
        );
    }
}