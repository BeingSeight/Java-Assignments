class LogicalOperator {

        public static void main(String[] args) {
            boolean a = true;
            boolean b = false;
            System.out.println("Logical AND:");
            System.out.println(a + " && " + b + " = " + (a && b)); // true && false = false
            System.out.println(a + " && " + b + " = " + (a && b)); // true && false = false
            System.out.println(b + " && " + a + " = " + (b && a)); // false && true = false
            System.out.println(b + " && " + a + " = " + (b && a)); // false && true = false
    
            System.out.println("\nLogical OR:");
            System.out.println(a + " || " + b + " = " + (a || b)); // true || false = true
            System.out.println(a + " || " + b + " = " + (a || b)); // true || false = true
            System.out.println(b + " || " + a + " = " + (b || a)); // false || true = true
            System.out.println(a + " || " + b + " = " + (a || b)); // true || false = true
    
            System.out.println("\nLogical NOT:");
            System.out.println("! " + a + " = " + !a); // !true = false
            System.out.println("! " + b + " = " + !b); // !false = true  
            
        }
}
