package ru.penzgtu.tasks;

import java.util.List;

public class ObtainingUniqueListItem implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Obtaining a unique list item");
        List<Integer> list = List.of(2, 2, 1);
        System.out.printf("List: %s. \n", list);
        System.out.printf("Result: %s. \n", getUniqueListItem(list));

        list = List.of(4, 1, 2, 1 ,2);
        System.out.printf("List: %s. \n", list);
        System.out.printf("Result: %s. \n", getUniqueListItem(list));

        list = List.of(1);
        System.out.printf("List: %s. \n", list);
        System.out.printf("Result: %s. \n", getUniqueListItem(list));
    }

    /**
     * Getting a unique item from the list.
     *
     * @param list list of numbers.
     * @return unique element.
     */
    private Integer getUniqueListItem(List<Integer> list) {
        for (int number : list) {
            if (list.indexOf(number) == list.lastIndexOf(number)) {
                return number;
            }
        }
        return null;
    }
}