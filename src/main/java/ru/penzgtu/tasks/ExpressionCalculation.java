package ru.penzgtu.tasks;

import java.util.Scanner;

public class ExpressionCalculation implements TaskRunnable {
    public void run() {
        System.out.println("[?] Expression calculation");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        int sign = -1;
        double statement = 0;
        for (int i = 0; i < 1_000; i++) {
            sign *= -1;
            statement += sign * (double) number / (i + 1);
        }
        System.out.println("Result: " + statement);
    }
}