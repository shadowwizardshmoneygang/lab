package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LuckyNumbersOutput implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Lucky numbers output");
        List<Integer> numbers = RandomNumber.generateList();

        int maximum = numbers.stream().max(Integer::compare).get();
        List<Integer> luckyNumbers = new LinkedList<>(IntStream.rangeClosed(1, maximum).boxed().toList());

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

        System.out.print(
                numbers.stream()
                        .filter(luckyNumbers::contains)
                        .map(number -> Integer.toString(number))
                        .collect(Collectors.joining(", ", "Lucky numbers: ", ".\n"))
        );
    }
}