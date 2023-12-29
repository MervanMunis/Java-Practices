// Question 3: String Formatting and Substring
// Write a Java program that takes a sentence as input and prints the first three words in uppercase.

import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringFormatter {

    public void formatString(String sentence, int upperCaseWords){
        // Using StringTokenizer to break the sentence into words
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        Set<String> upperCaseString = new HashSet<>();

        // Printing the first three words in uppercase
        // hasMoreTokens() that returns true if there are more tokens (words) in the string
        // Printing the first three words in uppercase
        for (int i = 0; i < upperCaseWords && tokenizer.hasMoreTokens(); i++) {
            String word = tokenizer.nextToken();
            System.out.print(word.toUpperCase() + " ");
        }
        for (int j=0; j<sentence.length()-tokenizer.countTokens() && tokenizer.hasMoreTokens();j++){
            String restOfWords = tokenizer.nextToken();
            System.out.print(restOfWords.toLowerCase() + " ");
        }

    }
}
