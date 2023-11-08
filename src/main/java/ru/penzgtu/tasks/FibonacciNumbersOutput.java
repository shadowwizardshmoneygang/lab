package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FibonacciNumbersOutput implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Fibonacci numbers output");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of list with a space (x - end): ");
        List<Integer> numbers = new LinkedList<>();
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }

        // Trying to use lazy evaluation.
        System.out.print(
                numbers.stream()
                        .filter(FibonacciSequence::isFibonacciNumber)
                        .map(number -> Integer.toString(number))
                        .collect(Collectors.joining(", ", "Fibonacci numbers: ", "."))
        );
    }
}