package ru.penzgtu.tasks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ObtainingUniqueListItem implements Runnable{
    @Override
    public void run() {
        System.out.println("[?] Obtaining a unique list item");
        List<Integer> list = new LinkedList<>(Arrays.asList(2, 2, 1));
        System.out.println("List: " + list);
        System.out.println("Result: " + getUniqueListItem(list));

        list = new LinkedList<>(Arrays.asList(4, 1, 2, 1 ,2));
        System.out.println("List: " + list);
        System.out.println("Result: " + getUniqueListItem(list));

        list = new LinkedList<>(List.of(1));
        System.out.println("List: " + list);
        System.out.println("Result: " + getUniqueListItem(list));
    }

    private Integer getUniqueListItem(List<Integer> list) {
        for (int number : list) {
            if (list.indexOf(number) == list.lastIndexOf(number)) {
                return number;
            }
        }
        return null;
    }
}