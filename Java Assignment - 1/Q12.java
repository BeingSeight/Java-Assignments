
public class Q12 {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;
        
        // Addition Operator
        int sum = a + b;
        System.out.println("Addition: " + a + " + " + b + " = " + sum);

        // Subtraction Operator
        int difference = a - b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + difference);

        // Multiplication Operator
        int product = a * b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + product);

        // Division Operator
        int quotient = a / b;
        System.out.println("Division: " + a + " / " + b + " = " + quotient);

        // Modulus Operator
        int remainder = a % b;
        System.out.println("Modulus: " + a + " % " + b + " = " + remainder);

        // Unary Plus Operator
        int unaryPlus = +a;
        System.out.println("Unary Plus: +" + a + " = " + unaryPlus);

        // Unary Minus Operator
        int unaryMinus = -a;
        System.out.println("Unary Minus: -" + a + " = " + unaryMinus);

        // Increment Operator (prefix)
        int prefixIncrement = ++a;
        System.out.println("Prefix Increment: ++" + a + " = " + prefixIncrement);

        // Increment Operator (postfix)
        a = 5; // reset a
        int postfixIncrement = a++;
        System.out.println("Postfix Increment: " + a + "++ = " + postfixIncrement);

        // Decrement Operator (prefix)
        int prefixDecrement = --a;
        System.out.println("Prefix Decrement: --" + a + " = " + prefixDecrement);

        // Decrement Operator (postfix)
        a = 5; // reset a
        int postfixDecrement = a--;
        System.out.println("Postfix Decrement: " + a + "-- = " + postfixDecrement);
    }
}
