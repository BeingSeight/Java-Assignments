public class CompoundAssignmentOperator {
    public static void main(String[] args) {

int a = 10;
int b = 2;
 System.out.println("Arithmetic Compound Assignment:");
    System.out.println("a = " + a + ", b = " + b);

    a += b; // a = a + b
    System.out.println("a += b: " + a);

    a -= b; // a = a - b
    System.out.println("a -= b: " + a);

    a *= b; // a = a * b
    System.out.println("a *= b: " + a);

    a /= b; // a = a / b
    System.out.println("a /= b: " + a);

    a %= b; // a = a % b
    System.out.println("a %= b: " + a);

   
    int c = 5;
    int d = 3;

    System.out.println("\nBitwise Compound Assignment:");
    System.out.println("c = " + c + ", d = " + d);

    c &= d; // c = c & d
    System.out.println("c &= d: " + c);

    c |= d; // c = c | d
    System.out.println("c |= d: " + c);

    c ^= d; // c = c ^ d
    System.out.println("c ^= d: " + c);

  
    int e = 10;

    System.out.println("\nShift Compound Assignment:");
    System.out.println("e = " + e);

    e <<= 2; // e = e << 2
    System.out.println("e <<= 2: " + e);

    e >>= 1; // e = e >> 1
    System.out.println("e >>= 1: " + e);

    e >>>= 1; // e = e >>> 1
    System.out.println("e >>>= 1: " + e);
   }
}