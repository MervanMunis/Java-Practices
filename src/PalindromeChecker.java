// Question 8: Palindrome Check
// Write a Java program that checks if a given string is a palindrome (reads the same backward as forward).

public class PalindromeChecker {

    public boolean isPalindrome(String string) {

        // Removing spaces and converting to lowercase
        string = string.replaceAll("\\s", "").toLowerCase();

        // Comparing the original and reversed strings
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }
}
