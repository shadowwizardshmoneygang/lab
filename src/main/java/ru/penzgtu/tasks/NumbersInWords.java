package ru.penzgtu.tasks;

public class NumbersInWords implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Numbers in words");
        String[] nameOfNumbers = {
                "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };
        int randomNumber = (int) Math.floor(Math.random() * 10);
        System.out.println(randomNumber + " - " + nameOfNumbers[randomNumber]);
    }
}