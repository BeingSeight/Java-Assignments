// 13. WAP to demonstrate increment (pre and post) and decrement  (pre and post) operators. 

class Q13 {
  public static void main(String[] args) {
      int a = 10;
      int b = 10;

      System.out.println("Pre-increment operator:");
      System.out.println("a = " + a);
      System.out.println("++a = " + ++a);
      System.out.println("a = " + a);

   
      System.out.println("\nPost-increment operator:");
      System.out.println("b = " + b);
      System.out.println("b++ = " + b++);
      System.out.println("b = " + b);

      System.out.println("\nPre-decrement operator:");
      System.out.println("a = " + a);
      System.out.println("--a = " + --a);
      System.out.println("a = " + a);

     
      System.out.println("\nPost-decrement operator:");
      System.out.println("b = " + b);
      System.out.println("b-- = " + b--);
      System.out.println("b = " + b);
  }

}

