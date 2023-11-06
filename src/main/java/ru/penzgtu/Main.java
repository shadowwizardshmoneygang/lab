package ru.penzgtu;

import ru.penzgtu.tasks.*;
import ru.penzgtu.tasks.Runnable;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Runnable> tasks = new LinkedList<>(Arrays.asList(
                new MergingOfSortedLists(), new DeletionOfAllDuplicates(), new ObtainingUniqueListItem(),
                new PrimeNumbersOutput(), new LuckyNumbersOutput(), new NumbersInWords(),
                new ProofOfFermatsTheorem(), new ExpressionCalculation(), new FibonacciNumbersOutput(),
                new PalindromeNumbersOutput(), new FractionalPartOutput(), new ConstructingPascalsTriangle()
        ));

        for (Runnable task : tasks) {
            task.run();
        }
    }
}