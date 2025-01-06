// Compound Assignment Operator

public class CompAssignOperator {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 16;
        num2 += num1; // num2 = num2 + num1
        System.out.println("num2 = num2 + num1: " + num2);
        num2 -= num1; // num2 = num2 - num1
        System.out.println("num2 = num2 - num1: " + num2);
        num2 *= num1; // num2 = num2 * num1
        System.out.println("num2 = num2 * num1: " + num2);
        num2 /= num1; // num2 = num2 / num1
        System.out.println("num2 = num2 / num1: " + num2);
        num2 %= num1; // num2 = num2 % num1
        System.out.println("num2 = num2 % num1: " + num2);
    }
}