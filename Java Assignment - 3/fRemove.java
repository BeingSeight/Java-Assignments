/*
 * 7. Write a Java program to remove a specific element from an array.
 */

import java.util.Scanner;

class fRemove {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int remove = 3;
        int[] newNumbers = new int[numbers.length - 1];
        int position = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == remove) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (i != position) {
                    newNumbers[j] = numbers[i];
                    j++;
                }
            }
            for (int i = 0; i < newNumbers.length; i++) {
                System.out.println("Element at index " + i + ": " + newNumbers[i]);
            }
        } else {
            System.out.println("Element not found");
        }
    }
}