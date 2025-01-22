// Q32. Explain StringBuilder class. What is the initial capacity of StringBuilder object? 
// Explain constructors and methods of StringBuilder class with examples.

public class zzdStrBuilder {
    public static void main(String[] args) {
        // StringBuilder class is mutable, allowing modifications without creating new instances.
        // Initial capacity is 16 characters by default.

        // Constructors
        StringBuilder sb3 = new StringBuilder("Hello"); // Initialized with "Hello"

        // i. compareTo()
        int comparison = sb3.toString().compareTo("Hello World"); // Lexicographical comparison
        System.out.println("Comparison result: " + comparison);

        // ii. delete(int start, int end)
        sb3.delete(0, 2); // Deletes characters from index 0 to 1
        System.out.println("After delete: " + sb3);

        // iii. deleteCharAt(int index)
        sb3.deleteCharAt(0); // Deletes character at index 0
        System.out.println("After deleteCharAt: " + sb3);

        // iv. ensureCapacity(int minimumCapacity)
        sb3.ensureCapacity(100); // Ensures capacity is at least 100

        // v. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] destArray = new char[5];
        sb3.getChars(0, sb3.length() < 5 ? sb3.length() : 5, destArray, 0); // Copies characters to destArray
        System.out.println("Copied chars: " + new String(destArray));

        // vi. insert(int offset, String str)
        sb3.insert(1, "y"); // Inserts "y" at index 1
        System.out.println("After insert: " + sb3);

        // vii. indexOf(String str)
        int index = sb3.indexOf("y"); // Finds index of "y"
        System.out.println("Index of 'y': " + index);

        // viii. lastIndexOf(String str)
        int lastIndex = sb3.lastIndexOf("o"); // Finds last occurrence of "o"
        System.out.println("Last index of 'o': " + lastIndex);

        // ix. setCharAt(int index, char ch)
        sb3.setCharAt(0, 'H'); // Sets character at index 0 to 'H'
        System.out.println("After setCharAt: " + sb3);

        // x. setLength(int newLength)
        sb3.setLength(5); // Sets length to 5 (truncates if longer)
        System.out.println("After setLength: " + sb3);

        // xi. append(String str)
        sb3.append(" World"); // Appends " World"
        System.out.println("After append: " + sb3);

        // xii. charAt(int index)
        char firstChar = sb3.charAt(0); // Gets character at index 0
        System.out.println("First character: " + firstChar);

        // xiii. reverse()
        sb3.reverse(); // Reverses the string
        System.out.println("After reverse: " + sb3);

        // xiv. length()
        int length = sb3.length(); // Gets the length of the string
        System.out.println("Length: " + length);

        // xv. capacity()
        int capacity = sb3.capacity(); // Gets the current capacity
        System.out.println("Capacity: " + capacity);

        // xvi. substring(int beginIndex)
        String substring = sb3.substring(1); // Gets substring from index 1
        System.out.println("Substring from index 1: " + substring);

        // xvii. replace(int start, int end, String str)
        sb3.replace(0, 5, "Hi"); // Replaces characters from index 0 to 4 with "Hi"
        System.out.println("After replace: " + sb3);
    }
}
