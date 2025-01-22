//22. Write a Java program to count words in Given String.
class uCountStr{
    public static void main(String []args){
       String sentence="This is an example.";   
       String []words=sentence.split("\\s+");   
       System.out.println(words.length);   
    }  
 }
 