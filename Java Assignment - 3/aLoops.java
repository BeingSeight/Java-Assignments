// 1. Explain all the loops in Java (Explaination, syntax, example program).

// Java has three types of loops: for, while, and do-while.
class LoopExamples {
    public static void main(String[] args) {
        // For loop example
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }

        // While loop example
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }

        // Do-while loop example
        int k = 0;
        do {
            System.out.println("Do-While loop iteration: " + k);
            k++;
        } while (k < 5);
    }
}