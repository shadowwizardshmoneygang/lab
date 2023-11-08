package ru.penzgtu.tasks;

import java.util.Arrays;
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

    /**
     * Output the contents of arrays (not to rewrite this code again).
     *
     * @param first first list.
     * @param second second list.
     */
    private void printLists(List<Integer> first, List<Integer> second) {
        System.out.println("List 1: " + first);
        System.out.println("List 2: " + second);
        System.out.println("Result: " + mergeSortedList(first, second));
    }

    /**
     * Merge two sorted lists with integer values into a single list
     * while preserving sorting.
     *
     * @param first first sorted list.
     * @param second second sorted list.
     * @return merged sorted list.
     */
    private List<Integer> mergeSortedList(List<Integer> first, List<Integer> second) {
        return Stream.concat(first.stream(), second.stream()).sorted().toList();
    }
}