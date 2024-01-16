public class VowelChecker {

    public static boolean isVowel(String string) {
        return string.toLowerCase().matches(".*[aeiou].*");
    }
}
