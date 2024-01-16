public class ReverseString {

    public static String reverseString(String string) {
        if (string==null)
            return "Please enter a string";

        StringBuilder reverseString = new StringBuilder();

        char[] chars = string.toCharArray();

        for (int i=chars.length - 1; i>=0; i--) {
            reverseString.append(chars[i]);
        }
        return reverseString.toString();
    }
}
