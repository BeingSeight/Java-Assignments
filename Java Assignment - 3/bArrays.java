/* 
2. Explain arrays in Java (1D array: syntax, initialization, example, 2D array:
syntax, initialization, example, Jagged array: syntax, initialization, example).
*/

// Java has three types of arrays: 1D, 2D, and Jagged arrays.

// 1D Array:
// Syntax: dataType[] arrayName = new dataType[size];
// Initialization: dataType[] arrayName = {element1, element2, element3, ...};
// Example:
class bArrays {
    public static void main(String[] args) {
        // 1D array example
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("1D Array element at index " + i + ": " + numbers[i]);
        }

        // 2D array example
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("2D Array element at index [" + i + "][" + j + "]: " + matrix[i][j]);
            }
        }

        // Jagged array example
        int[][] jaggedArray = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.println("Jagged Array element at index [" + i + "][" + j + "]: " + jaggedArray[i][j]);
            }
        }
    }
}