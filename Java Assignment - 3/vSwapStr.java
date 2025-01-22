//23. Write a Java program to swap two strings.
class vSwapStr{
    public static void main(String []args){
       String str1="Hello";    
       String str2="World";    
       
       // Swapping using temporary variable    
       String temp=str1;    
       str1=str2;    
       str2=temp;    
 
       System.out.println(str1+" "+str2);    
    }   
 }