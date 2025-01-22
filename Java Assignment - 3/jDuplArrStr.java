//11. Write a Java program to find duplicate values in an array of string values.
class jDuplArrStr {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple"}; 
        
        for(int i=0;i<arr.length;i++) { 
            for(int j=i+1;j<arr.length;j++) { 
                if(arr[i].equals(arr[j])) 
                    System.out.println("Duplicate found: " + arr[i]); 
            } 
        } 
    }
 }
 