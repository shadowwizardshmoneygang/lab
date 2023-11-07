package ru.penzgtu.tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class MergingOfSortedLists implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Merging of sorted lists");
        List<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(1, 3, 4));
        printLists(list1, list2);

        list1 = new LinkedList<>();
        list2 = new LinkedList<>();
        printLists(list1, list2);

        list1 = new LinkedList<>();
        list2 = new LinkedList<>(List.of(0));
        printLists(list1, list2);
    }

    private void printLists(List<Integer> first, List<Integer> second) {
        System.out.println("List 1: " + first);
        System.out.println("List 2: " + second);
        System.out.println("Result: " + mergeSortedList(first, second));
    }

    private List<Integer> mergeSortedList(List<Integer> first, List<Integer> second) {
        List<Integer> mergedList = new LinkedList<>(Stream.concat(first.stream(), second.stream()).toList());
        Collections.sort(mergedList);
        return mergedList;
    }
}