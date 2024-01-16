import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

    public static List<Integer> fibonacciSequenceOf(int number) {

        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        fibonacciNumbers.add(0);
        fibonacciNumbers.add(1);
        fibonacciNumbers.add(1);

        if (fibonacciNumbers.size()>=number) {
            return fibonacciNumbers;
        }

        for (int i = 3; i<number; i++) {
            fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i-2));
        }
        return fibonacciNumbers;

    }
}
