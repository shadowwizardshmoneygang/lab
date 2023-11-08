package ru.penzgtu;

import ru.penzgtu.tasks.*;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of(
                new MergingOfSortedLists(), new DeletionOfAllDuplicates(), new ObtainingUniqueListItem(),
                new PrimeNumbersOutput(), new LuckyNumbersOutput(), new NumbersInWords(),
                new ProofOfFermatsTheorem(), new ExpressionCalculation(), new FibonacciNumbersOutput(),
                new PalindromeNumbersOutput(), new FractionalPartOutput(), new ConstructingPascalsTriangle()
        ).forEach(TaskRunnable::run);
    }
}