//16. Write a program to compare two strings lexicographically ignoring case differences.
class oStrLexi {
    public static void main(String[] args) {
        String str1 = "hello"; 
        String str2 = "HELLO"; 
         
        boolean isEqualIgnoreCase=str1.equalsIgnoreCase(str2);  
        System.out.println("Strings are equal ignoring case: " + isEqualIgnoreCase);  
    }
 }