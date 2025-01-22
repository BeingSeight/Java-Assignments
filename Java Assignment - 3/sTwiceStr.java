//20. Write a Java program to create a new string repeating every character twice of a given string.
class sTwiceStr{
    public static void main(String []args){
       String original="abc";  
       StringBuilder repeated=new StringBuilder();  
       for(char c : original.toCharArray()){  
          repeated.append(c).append(c);  
       }  
       System.out.println(repeated.toString());  
    }  
 }