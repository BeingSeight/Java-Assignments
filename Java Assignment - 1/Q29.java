// 29. WAP to check whether the inputted character is Vowel or  Consonant

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        boolean isVowel = isVowel(ch);

        if (isVowel) {
            System.out.println(ch + " is a vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a consonant");
        } else {
            System.out.println(ch + " is not a letter");
        }
        scanner.close();
    }

    public static boolean isVowel(char ch) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                return true;
            }
        }

        return false;
    }
}
