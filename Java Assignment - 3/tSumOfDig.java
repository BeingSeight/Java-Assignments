//21. Write a Java program to return the sum of the digits present in the given string.
class SumOfDigits{
    public static void main(String []args){
       String input="abc123";  
       int sum=0;  
 
       for(char c : input.toCharArray()){  
          if(Character.isDigit(c)){  
              sum += Character.getNumericValue(c);  
          }  
       }  
       System.out.println(sum);  
    }  
 }