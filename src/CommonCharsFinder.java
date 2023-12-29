// Question 2: Common Characters in Two Strings Write a Java program that finds
// and prints the common characters between two strings.

import java.util.HashSet;
import java.util.Set;

public class CommonCharsFinder {

    public void findCommonChars1(String string1, String string2) {
        // Converting strings to character arrays
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();

        // Using Set to store common characters
        Set<Character> commonChars = new HashSet<>();

        for (char char1 : chars1) {
            if (string2.contains(String.valueOf(char1))){
                commonChars.add(char1);
            }
        }

        System.out.println("Common characters: " + commonChars);
    }

    public void findCommonCharacters2(String string1, String string2) {
        // Using streams to filter common characters
        string1.chars().distinct()
                .filter(ch -> string2.indexOf(ch) != -1)
                .forEach(ch -> System.out.print( (char) ch + " "));
    }
}
