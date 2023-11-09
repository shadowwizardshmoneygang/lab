package ru.penzgtu.tasks;

import java.util.List;
import java.util.Set;

public class DeletionOfAllDuplicates implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Deletion of all duplicates");
        List<Integer> list = List.of(1, 1, 2);
        System.out.printf("List: %s. \n", list);
        System.out.printf("Result: %s. \n", Set.copyOf(list));

        list = List.of(1, 1, 2, 3, 3);
        System.out.printf("List: %s. \n", list);
        System.out.printf("Result: %s. \n", Set.copyOf(list));
    }
}