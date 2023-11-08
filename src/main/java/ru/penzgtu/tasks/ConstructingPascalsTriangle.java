package ru.penzgtu.tasks;

import java.util.ArrayList;
import java.util.List;

public class ConstructingPascalsTriangle implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Constructing Pascal's triangle");
        // If the number is greater than 14, the output breaks.
        List<Integer> numbers = new ArrayList<>(List.of((int) (Math.random() * 10)));

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