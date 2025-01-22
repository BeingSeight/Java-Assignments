//10. Write a Java program to find duplicate values in an array of integer values.
class iDuplArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2}; 
        
        for(int i=0;i<arr.length;i++) { 
            for(int j=i+1;j<arr.length;j++) { 
                if(arr[i]==arr[j]) 
                    System.out.println("Duplicate found: " + arr[i]); 
            } 
        } 
    }
 }