/*
  WAP to perform binary search in java.
 */

class eBinSearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int search = 3;
        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == search) {
                found = true;
                break;
            } else if (numbers[mid] < search) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}