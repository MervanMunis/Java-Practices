import java.util.Arrays;

public class AnagramChecker {

    public boolean areAnagrams(String string1, String string2) {
        // Removing spaces and converting to lowercase
        string1 = string1.replaceAll("\\s", "").toLowerCase();
        string2 = string2.replaceAll("\\s", "").toLowerCase();

        // Converting strings to char arrays and sorting
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();

        // Checking if the sorted char arrays are equal
        return Arrays.equals(charArray1, charArray2);

    }
}
