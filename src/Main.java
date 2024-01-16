import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main extends Overriding {
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
        System.out.println("------------------Question 11: Stream and Mapping------------------");
        System.out.println("Given a list of integers, square each element and then find the sum of the squared values.");
        int[] numbersToSquare = {2, 3, 4, 5};

        // Squaring each element and finding the sum
        int sumOfSquares = Arrays.stream(numbersToSquare)
                .map(n -> n * n)
                .sum();

        // Displaying the result
        System.out.println("Sum of Squares: " + sumOfSquares);


        System.out.println();
        System.out.println("------------------Question 12: Reverse the given string------------------");
        System.out.println("How do you reverse a string in java");

        String reverseThis = "Hi, my name is Mervan Munis what is yours.";

        String reversedString = ReverseString.reverseString(reverseThis);

        System.out.println(reversedString);

        System.out.println();
        System.out.println("------------------Question 13: Checking if there is a vowel------------------");
        System.out.println("Write a Java program to check if a vowel is present in a string.");

        String vowel = "Hello";

        boolean checkVowel = VowelChecker.isVowel(vowel);

        System.out.println(checkVowel);

        System.out.println();
        System.out.println("------------------Question 14: Prime Number------------------");
        System.out.println("Write a Java program to check if the given number is a prime number.");

        System.out.println(PrimeNumber.isPrime(17));
        System.out.println(PrimeNumber.isPrime(15));
        System.out.println(PrimeNumber.isPrime(29));

        System.out.println();
        System.out.println("------------------Question 15: Fibonacci Sequence------------------");
        System.out.println("Write a Java program to print a Fibonacci sequence using recursion.");

        System.out.println(FibonacciSequence.fibonacciSequenceOf(12));

        System.out.println();
        System.out.println("--------------------Question 16: Odd Number Checker------------------");
        System.out.println("How do you check if a list of integers contains only odd numbers in Java?");

        System.out.println(CheckOddNumbers.isOddNumbers(Arrays.asList(1,3,5,9)));
        System.out.println(CheckOddNumbers.isOddNumbers(Arrays.asList(1,3,6,9)));

        System.out.println();
        System.out.println("--------------------Question 17: Date Format------------------");
        System.out.println("How do you print a date in specific format in Java?");

        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

        System.out.println();
        System.out.println("--------------------Question 18: Merge Two List------------------");
        System.out.println(" How do you merge two lists in Java?");

        List<String> list1 = new ArrayList<>();
        list1.add("1");
        List<String> list2 = new ArrayList<>();
        list2.add("2");

        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        System.out.println(mergedList);

        System.out.println();
        System.out.println("--------------------Question 19: Sort By HashMap------------------");
        System.out.println("Write a Java program that sorts HashMap by value.");

        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);
        System.out.println(scores);

        scores = SortByValueHashMap.sortByValue(scores);

        System.out.println(scores);

        System.out.println();
        System.out.println("--------------------Question 20: Stream Function------------------");
        System.out.println("The use of stream in java");

        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x*x).toList();
        System.out.println(square);

        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).toList();
        System.out.println(result);

        // demonstration of sorted method
        List<String> show = names.stream().sorted().toList();

        System.out.println(show);

        List<Integer> numbers2 = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet = numbers2.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        // demonstration of reduce method
        int even = number.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(even);

        System.out.println();
        System.out.println("--------------------Question 21: Overloading vs Overriding------------------");
        System.out.println("Show examples of overloading and overriding in Java.");

        Overloading.printString("ab", 2);

        Main main = new Main();
        System.out.println("---Overriding---");
        main.printName();
    }

    @Override
    void printName() {
        System.out.println("Child Class");
    }
}
