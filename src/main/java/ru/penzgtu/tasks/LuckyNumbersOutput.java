package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LuckyNumbersOutput implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Lucky numbers output");
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

        List<Integer> luckyNumbers = new LinkedList<>();
        for (int i = 0; i < maximum; i++) {
            luckyNumbers.add(i + 1);
        }

        List<Integer> previousNumbers = new LinkedList<>(List.of(1));
        while (!previousNumbers.equals(luckyNumbers)) {
            for (int luckyNumber : luckyNumbers) {
                if (previousNumbers.contains(luckyNumber)) {
                    continue;
                }
                previousNumbers.add(luckyNumber);
                if (previousNumbers.contains(2)) {
                    previousNumbers.remove((Integer) 2);
                }
                for (int i = luckyNumber - 1; i < luckyNumbers.size(); i += luckyNumber) {
                    luckyNumbers.set(i, null);
                }
                break;
            }
            while (luckyNumbers.contains(null)) {
                luckyNumbers.remove(null);
            }
        }

        System.out.print("Lucky numbers: ");
        for (int number : numbers) {
            if (luckyNumbers.contains(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }
}