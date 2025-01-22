/*
 * Q15. WAP to demonstrate the functionality of all the methods of String class.
1. int length()
2. char charAt(int index)
3. int indexOf(int ch)
4. int indexOf(int ch, int fromIndex)
5. int indexOf(String substring)
6. int indexOf(String substring, int fromIndex)
7. lastIndexOf( )
8. String substring(int beginIndex)
9. String substring(int beginIndex, int endIndex)
10.boolean contains(CharSequence s)
11.String concat(String s)
12.boolean equals(Object o)
13.boolean equalsIgnoreCase(String s)
14.boolean isEmpty()

15.boolean equals(Object o)
16.boolean equalsIgnoreCase(String s)
17.String toLowerCase()
18.String toUpperCase()
19.int compareTo( String anotherString)
20.int compareToIgnoreCase( String anotherString)
21.String trim()
22. String replace (char oldChar, char newChar)
23.char[] toCharArray()
24. boolean startsWith(String s)
25.boolean endswith(String s)
26.static String join(CharSequence delim, CharSequence . . . strs)
 */

public class nStrMethod {
    public static void main(String[] args) {
        String str = " Hello World ";

        // 1. int length()
        System.out.println("Length: " + str.length()); // Outputs the length of the string.

        // 2. char charAt(int index)
        System.out.println("Char at index 0: " + str.charAt(0)); // Outputs the character at index 0.

        // 3. int indexOf(int ch)
        System.out.println("Index of 'o': " + str.indexOf('o')); // Outputs the index of first occurrence of 'o'.

        // 4. int indexOf(int ch, int fromIndex)
        System.out.println("Index of 'o' from index 5: " + str.indexOf('o', 5)); // Searches for 'o' starting from index 5.

        // 5. int indexOf(String substring)
        System.out.println("Index of 'World': " + str.indexOf("World")); // Outputs the index of substring "World".

        // 6. int indexOf(String substring, int fromIndex)
        System.out.println("Index of 'o' from index 5: " + str.indexOf("o", 5)); // Searches for substring "o" starting from index 5.

        // 7. lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // Outputs the last occurrence of 'o'.

        // 8. String substring(int beginIndex)
        System.out.println("Substring from index 6: " + str.substring(6)); // Outputs substring starting from index 6.

        // 9. String substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 6 to 11: " + str.substring(6, 11)); // Outputs substring from index 6 to 11.

        // 10. boolean contains(CharSequence s)
        System.out.println("Contains 'World': " + str.contains("World")); // Checks if string contains "World".

        // 11. String concat(String s)
        System.out.println("Concatenated string: " + str.concat("!")); // Concatenates "!" to the string.

        // 12. boolean equals(Object o)
        System.out.println("Equals ' Hello World ': " + str.equals(" Hello World ")); // Checks if strings are equal.

        // 13. boolean equalsIgnoreCase(String s)
        System.out.println("Equals ignore case ' hello world ': " + str.equalsIgnoreCase(" hello world ")); // Checks equality ignoring case.

        // 14. boolean isEmpty()
        System.out.println("Is empty: " + str.isEmpty()); // Checks if the string is empty.

        // 15. String toLowerCase()
        System.out.println("To lower case: " + str.toLowerCase()); // Converts string to lower case.

        // 16. String toUpperCase()
        System.out.println("To upper case: " + str.toUpperCase()); // Converts string to upper case.

        // 17. int compareTo(String anotherString)
        System.out.println("Compare to 'Hello World': " + str.compareTo("Hello World")); // Compares strings lexicographically.

        // 18. int compareToIgnoreCase(String anotherString)
        System.out.println("Compare to ignore case 'hello world': " + str.compareToIgnoreCase("hello world")); // Compares ignoring case.

        // 19. String trim()
        System.out.println("Trimmed string: '" + str.trim() + "'"); // Removes leading and trailing spaces.
        
        // 20. String replace(char oldChar, char newChar)
        System.out.println("Replace 'o' with 'O': " + str.replace('o', 'O')); // Replaces 'o' with 'O'.

        // 21. char[] toCharArray()
        char[] charArray = str.toCharArray(); 
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " "); 
        }
        
        System.out.println(); 

        // 22. boolean startsWith(String s)
        System.out.println("Starts with ' He': " + str.startsWith(" He")); // Checks if string starts with given prefix.

        // 23. boolean endsWith(String s)
        System.out.println("Ends with 'ld ': " + str.endsWith("ld ")); // Checks if string ends with given suffix.
        
      	//24. static String join(CharSequence delim, CharSequence... strs)
      	System.out.println("Join example: "+String.join("-", new String[]{"Hello", "World"})); 
    }
}
