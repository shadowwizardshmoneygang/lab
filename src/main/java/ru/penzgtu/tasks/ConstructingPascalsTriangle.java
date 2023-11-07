package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ConstructingPascalsTriangle implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Constructing Pascal's triangle");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of list with a space (x - end): ");
        List<Integer> numbers = new LinkedList<>();
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }

        for (int number : numbers) {
            if (number < 0) continue;
            int coefficient = 1;

            for (int i = 0; i < number; i++) {
                for (int j = 1; j < number - i; j++)
                    System.out.print("  ");

                for (int j = 0; j <= i; j++) {
                    if (j == 0 || i == 0)
                        coefficient = 1;
                    else
                        coefficient = coefficient * (i - j + 1) / j;

                    System.out.printf("%4d", coefficient);
                }

                System.out.println();
            }
            break;
        }
    }
}