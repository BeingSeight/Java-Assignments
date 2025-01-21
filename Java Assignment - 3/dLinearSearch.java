/*
4. WAP to perform linear search in java.
*/

class dLinearSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int search = 3;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}