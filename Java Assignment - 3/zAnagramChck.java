//27. Program to check two strings are Anagram of each other in Java.
class zAnagramChck{
    public static void main(String []args){
      String str1="listen";    
      String str2="silent";    
 
      char []arr1=str1.toCharArray();    
      char []arr2=str2.toCharArray();    
      java.util.Arrays.sort(arr1);    
      java.util.Arrays.sort(arr2);    
 
      boolean isAnagram=java.util.Arrays.equals(arr1,arr2);    
      System.out.println(isAnagram);    
    }   
 }