package ru.penzgtu.tasks;

public class ExpressionCalculation implements TaskRunnable {
    public void run() {
        System.out.println("[?] Expression calculation");
        int number = RandomNumber.generateNumber();
        System.out.println("Number: " + number);

        int sign = -1;
        double statement = 0;
        for (int i = 0; i < 1_000; i++) {
            sign *= -1;
            statement += sign * (double) number / (i + 1);
        }
        System.out.println("Result: " + statement);
    }
}