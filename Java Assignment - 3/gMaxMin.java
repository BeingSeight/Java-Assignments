/* 
 * 8. Write a Java program to find the maximum and minimum value of an array.
 */

 class gMaxMin {
    public static void main(String[] args) {
        int[] arr = {10, -20, 30};
        
        int max = arr[0], min = arr[0]; // Initialize max and min
        
        for (int num : arr) { // Iterate through the array
            if (num > max) max = num; // Update max if necessary
            if (num < min) min = num; // Update min if necessary
        }
        
        System.out.println("Max: " + max + ", Min: " + min); 
    }
}