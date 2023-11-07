package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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

        int maximum = numbers.get(0);
        for (int number : numbers) {
            maximum = Math.max(maximum, number);
        }

        System.out.print("Fibonacci numbers: ");
        for (int number : numbers) {
            if (FibonacciSequence.isFibonacciNumber(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}