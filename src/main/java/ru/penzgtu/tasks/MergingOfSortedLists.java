package ru.penzgtu.tasks;

import java.util.List;
import java.util.stream.Stream;

public class MergingOfSortedLists implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Merging of sorted lists");
        List<Integer> list1 = List.of(1, 2, 4);
        List<Integer> list2 = List.of(1, 3, 4);
        printLists(list1, list2);

        list1 = List.of();
        list2 = List.of();
        printLists(list1, list2);

        list1 = List.of();
        list2 = List.of(0);
        printLists(list1, list2);
    }

    /**
     * Output the contents of arrays (not to rewrite this code again).
     *
     * @param first first list.
     * @param second second list.
     */
    private void printLists(List<Integer> first, List<Integer> second) {
        System.out.printf("List 1: %s. \n", first);
        System.out.printf("List 2: %s. \n", second);
        System.out.printf("Result: %s. \n", mergeSortedList(first, second));
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