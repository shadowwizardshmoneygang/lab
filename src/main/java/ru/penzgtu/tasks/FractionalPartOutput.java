package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FractionalPartOutput implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Fractional part output");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of list with a space (x - end): ");
        List<Integer> numbers = new LinkedList<>();
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > 0 && numbers.get(i + 1) > 0) {
                double statement = (double) numbers.get(i) / numbers.get(i + 1);
                System.out.println("Result is " + (statement - Math.floor(statement)));
                break;
            }
        }
    }
}