// Write a program to print all even numbers between 1 to 50.

public class fSumOdd {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers between 1 to 50: " + sum);
    }
}