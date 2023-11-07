package ru.penzgtu.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class DeletionOfAllDuplicates implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Deletion of all duplicates");
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 1, 2));
        System.out.println("List: " + list);
        System.out.println("Result" + new HashSet<>(list).stream().toList());

        list = new LinkedList<>(Arrays.asList(1, 1, 2, 3, 3));
        System.out.println("List: " + list);
        System.out.println("Result" + new HashSet<>(list).stream().toList());
    }
}