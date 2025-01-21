/*
 6. Write a Java program to insert an element (specific position) into an array.
 */

class dInsert {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] newNumbers = new int[numbers.length + 1];
        int insert = 6;
        int position = 2;
        for (int i = 0, j = 0; i < newNumbers.length; i++) {
            if (i == position) {
                newNumbers[i] = insert;
            } else {
                newNumbers[i] = numbers[j];
                j++;
            }
        }
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println("Element at index " + i + ": " + newNumbers[i]);

        }
    }
}