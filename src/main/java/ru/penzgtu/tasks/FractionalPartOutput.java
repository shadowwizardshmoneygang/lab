package ru.penzgtu.tasks;

import java.util.List;

public class FractionalPartOutput implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Fractional part output");
        List<Integer> numbers = RandomNumber.generateList();
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= 0 && numbers.get(i + 1) >= 0) {
                double statement = (double) numbers.get(i) / numbers.get(i + 1);
                System.out.printf("Result: %s. \n", (statement - Math.floor(statement)));
                break;
            }
        }
    }
}