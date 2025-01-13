// WAP to check whether the inputted number is Armstrong Number or not.

import java.util.Scanner;
public class kArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int temp = num;
        int sum = 0;
        while (num != 0) {
            sum += Math.pow(num % 10, 3);
            num /= 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}