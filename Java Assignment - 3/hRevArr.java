//9. Write a Java program to reverse an array of integer values.
class hRevArr {
    public static void main(String[] args) {
       int[] arr = {1,2,3}; 
       
       for(int i=arr.length-1;i>=0;i--) { 
           System.out.print(arr[i] + " "); 
       } 
    }
}