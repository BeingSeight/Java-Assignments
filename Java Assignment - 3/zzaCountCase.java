//28. Write a Java program to count number of Uppercase and Lowercase letters.
class zzaCountCase{
    public static void main(String []args){
      String input="Hello World";   
      int upperCount=0;   
      int lowerCount=0;   
 
      for(char c : input.toCharArray()){   
          if(Character.isUpperCase(c)) upperCount++;   
          else if(Character.isLowerCase(c)) lowerCount++;   
      }
 
      System.out.printf("Uppercase count: %d Lowercase count: %d\n", upperCount, lowerCount);   
    }   
 }
 