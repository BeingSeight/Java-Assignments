// WAP to find average of consecutive N Odd numbers and even numbers.

import java.util.Scanner;
public class nAvgConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        sc.close();
        int oddSum = 0;
        int evenSum = 0;
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                evenSum += i;
                evenCount++;
            } else {
                oddSum += i;
                oddCount++;
            }
        }
        System.out.println("Average of consecutive " + n + " odd numbers: " + (double) oddSum / oddCount);
        System.out.println("Average of consecutive " + n + " even numbers: " + (double) evenSum / evenCount);
    }
}