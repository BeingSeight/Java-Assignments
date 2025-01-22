//26. Java string program to check whether a string is a Palindrome.
class yPald{
    public static void main(String []args){
      String original="madam";    
      String reversed=new StringBuilder(original).reverse().toString();    
      boolean isPalindrome=original.equals(reversed);    
      System.out.println(isPalindrome);    
    }   
 }