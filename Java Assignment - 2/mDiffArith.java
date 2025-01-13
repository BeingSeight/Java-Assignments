// Write a menu based Java program for performing different arithmetic operations.

import java.util.Scanner;
public class mDiffArith {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        sc.close();
        double result = 0;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Subtraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Multiplication: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not possible");
                } else {
                    result = num1 / num2;
                    System.out.println("Division: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}