import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------Question 1: Sorting and Finding Minimum/Maximum----------");

        MinMaxFinder minMaxFinder = new MinMaxFinder();
        int[] numbers = {3, 7, 1, 9, 5, 4};
        minMaxFinder.findMinMax(numbers);


        System.out.println();
        System.out.println("------------------Question 2: Common Characters in Two Strings-------------");

        String s1 = "hello";
        String s2 = "world";
        CommonCharsFinder commonCharsFinder = new CommonCharsFinder();
        commonCharsFinder.findCommonChars1(s1, s2);
        commonCharsFinder.findCommonCharacters2(s1, s2);

        System.out.println();
        System.out.println("------------------Question 3: String Formatting and Substring-------------");

        String inputSentence = "java programming is fun for me";
        StringFormatter stringFormatter = new StringFormatter();
        stringFormatter.formatString(inputSentence, 3);

        System.out.println();
        System.out.println("------------------Question 4: List Manipulation and Streaming-------------");

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        ListProcessor listProcessor = new ListProcessor();
        listProcessor.squareAndPrint(integerList);

        System.out.println();
        System.out.println("------------------Question 5: Stack Implementation-------------");
        System.out.println("Write a Java program to implement a basic stack with push and pop operations.");

        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Popping elements from the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println();
        System.out.println("------------------Question 6: String Splitting and Joining---------------------------");

        String splitSentence = "Java programming is interesting";
        String newDelimiter = "-";

        StringSplitter stringSplitter = new StringSplitter();

        String newString = stringSplitter.splitAndJoin(splitSentence, newDelimiter);
        System.out.println("New Sentence 1: " + newString);

        stringSplitter.replaceChar(splitSentence, newDelimiter);

        System.out.println();
        System.out.println("------------------Question 7: Palindrome Check---------------------------");

        String palindromeStr = "A man a plan a canal Panama";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean isPal = palindromeChecker.isPalindrome(palindromeStr);
        System.out.println("Is Palindrome? " + isPal);

        System.out.println();
        System.out.println("------------------Question 8: Anagram Check---------------------------");


        String word1 = "listen";
        String word2 = "silent";
        AnagramChecker anagramChecker = new AnagramChecker();
        boolean areAnagrams = anagramChecker.areAnagrams(word1, word2);

        if (areAnagrams) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }

        System.out.println();
        System.out.println("------------------Question 9: Stacking Elements------------------");
        System.out.println("Write a Java program to reverse a list of integers using streams.");

        List<Integer> numbersToReverse = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> reversedList = numbersToReverse.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println("Reversed List: " + reversedList);


        System.out.println();
        System.out.println("------------------Question 10: Formatting Strings------------------");
        System.out.println("Write a Java program to format a list of numbers as a comma-separated string.");

        List<Integer> numbersToFormat = Arrays.asList(10, 20, 30, 40, 50);

        String formattedString = numbersToFormat.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        System.out.println("Formatted String: " + formattedString);

        System.out.println();
        System.out.println("------------------Question 10: Stream and Mapping------------------");
        System.out.println("Given a list of integers, square each element and then find the sum of the squared values.");
        int[] numbersToSquare = {2, 3, 4, 5};

        // Squaring each element and finding the sum
        int sumOfSquares = Arrays.stream(numbersToSquare)
                .map(n -> n * n)
                .sum();

        // Displaying the result
        System.out.println("Sum of Squares: " + sumOfSquares);

    }

}