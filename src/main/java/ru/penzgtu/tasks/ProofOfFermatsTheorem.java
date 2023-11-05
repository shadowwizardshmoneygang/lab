package ru.penzgtu.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProofOfFermatsTheorem implements Runnable {
    @Override
    public void run() {
        System.out.println("[?] Proof of Fermat's theorem");
        Scanner input = new Scanner(System.in);

        System.out.println("Solutions for the second power:");
        checkFermatsTheorem(2);

        System.out.print("Enter the power: ");
        int power = input.nextInt();
        System.out.println("Result:");
        checkFermatsTheorem(power);
    }

    private void checkFermatsTheorem(int power) {
        List<Double> numbers = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            numbers.add(Math.pow(i + 1, power));
        }

        for (int i = 0; i < 100; i++) {
            double a = numbers.get(i);
            for (int j = 0; j < 100; j++) {
                double b = numbers.get(j);
                double c = a + b;
                if (numbers.contains(c)) {
                    System.out.println(a + " + " + b + " = " + c);
                }
            }
        }
    }
}
