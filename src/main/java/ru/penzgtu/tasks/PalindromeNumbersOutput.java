package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PalindromeNumbersOutput implements Runnable {
    @Override
    public void run() {
        System.out.println("[?] Palindrome numbers output");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numbers of list with a space (x - end): ");
        List<Integer> numbers = new LinkedList<>();
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }

        System.out.print("Palindrome numbers: ");
        for (int number : numbers) {
            if (isPalindrome(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private boolean isPalindrome(int number) {
        int temporary = number;
        int reverse = 0;
        while (temporary > 0) {
            int lastDigit = temporary % 10;
            temporary /= 10;
            reverse = reverse * 10 + lastDigit;
        }
        return reverse == number;
    }
}