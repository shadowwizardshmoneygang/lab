package ru.penzgtu.tasks;

import java.util.List;
import java.util.stream.IntStream;

public class RandomNumber {
    public static int generateNumber() {
        return (int) (Math.random() * 1_000);
    }

    public static List<Integer> generateList() {
        return IntStream.generate(RandomNumber::generateNumber)
                .limit(generateNumber())
                .boxed().toList();
    }
}