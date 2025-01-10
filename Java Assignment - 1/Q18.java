// 18. WAP to demonstrate logical operators in java. 


class Q18 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("Logical AND:");
        System.out.println(a + " && " + b + " = " + (a && b)); 
        System.out.println(a + " && " + b + " = " + (a && b)); 
        System.out.println(b + " && " + a + " = " + (b && a)); 
        System.out.println(a + " && " + b + " = " + (a && b)); 

        System.out.println("\nLogical OR:");
        System.out.println(a + " || " + b + " = " + (a || b)); 
        System.out.println(a + " || " + b + " = " + (a || b)); 
        System.out.println(b + " || " + a + " = " + (b || a)); 
        System.out.println(b + " || " + a + " = " + (b || a)); 

        System.out.println("\nLogical NOT:");
        System.out.println("! " + a + " = " + !a); 
        System.out.println("! " + b + " = " + !b); 
        
    }}

