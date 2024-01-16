import java.util.List;

public class CheckOddNumbers {

    public static boolean isOddNumbers(List<Integer> numbers) {
        return numbers.parallelStream().allMatch(number -> number%2 != 0);
    }
}
