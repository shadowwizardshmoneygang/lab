package ru.penzgtu.tasks;

import java.util.List;
import java.util.stream.IntStream;

public class ProofOfFermatsTheorem implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Proof of Fermat's theorem");
        System.out.println("Solutions for the second power:");
        checkFermatsTheorem(2);

        int power = RandomNumber.generateNumber();
        System.out.println("Solutions for the " + power + " power:");
        System.out.println("Result:");
        checkFermatsTheorem(power);
    }

    /**
     * Checking Fermat's theorem.
     *
     * @param power verifiable power.
     */
    private void checkFermatsTheorem(int power) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100)
                .map(number -> (int) Math.pow(number, power))
                .boxed().toList();

        for (int i = 0; i < 100; i++) {
            int a = numbers.get(i);
            for (int j = 0; j < 100; j++) {
                int b = numbers.get(j);
                int c = a + b;
                if (numbers.contains(c)) {
                    System.out.println(
                            a + " + " + b + " = " + c
                    );
                }
            }
        }
    }
}