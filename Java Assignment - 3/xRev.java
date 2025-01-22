//25. Write a Java program to reverse each word of a string.
class xRev{
    public static void main(String []args){
       String sentence="Hello World";    
       String []words=sentence.split("\\s+");    
 
       for(int i=0;i<words.length;i++){    
          words[i]=new StringBuilder(words[i]).reverse().toString();    
       }    
 
       System.out.println(String.join(" ", words));    
    }   
 }