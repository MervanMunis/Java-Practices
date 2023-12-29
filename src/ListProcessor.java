// Question 4: List Manipulation and Streaming
// Write a Java program that takes a list of integers, squares each element,
// and then prints the squared values.


import java.util.List;

public class ListProcessor {

    public void squareAndPrint(List<Integer> numbers){
        // Using stream to square each element and collect the results
        List<Integer> squaredList = numbers.stream()
                .map(x -> x*x)
                .toList();

        System.out.println("Number: " + numbers);
        System.out.println("Squared values: " + squaredList);
    }
}
