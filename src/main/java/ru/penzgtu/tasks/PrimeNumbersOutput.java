package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersOutput implements Runnable{
    @Override
    public void run() {
        System.out.println("[?] Prime numbers output");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of list with a space (x - end): ");
        List<Integer> numbers = new LinkedList<>();
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }

        System.out.print("Prime numbers: ");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

    }

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