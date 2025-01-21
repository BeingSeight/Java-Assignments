/*
 3. WAP to compute sum and average of 5 double elements of array.
 */

class cAvgArr {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.5, 3.5, 4.5, 5.5};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);
    }
}