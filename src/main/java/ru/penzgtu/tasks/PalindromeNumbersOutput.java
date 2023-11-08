package ru.penzgtu.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PalindromeNumbersOutput implements TaskRunnable {
    @Override
    public void run() {
        System.out.println("[?] Palindrome numbers output");
        List<Integer> numbers = RandomNumber.generateList();
        System.out.print(
                numbers.stream()
                        .filter(this::isPalindrome)
                        .map(number -> Integer.toString(number))
                        .collect(Collectors.joining(", ", "Palindrome numbers: ", ".\n"))
        );
    }

    /**
     * Checking whether a number is a palindrome.
     *
     * @param number verifiable number.
     * @return {@code true} if the number turned out to be a palindrome.
     */
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