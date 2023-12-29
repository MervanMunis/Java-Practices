// Question 1:
// Write a Java program that takes an array of integers and prints the minimum and maximum values.

import java.util.Arrays;

public class MinMaxFinder {

    public void findMinMax(int[] array){
        // Sorting the Array
        Arrays.sort(array);

        // Finding and printing the minimum and maximum
        int min = array[0];
        int max = array[array.length-1];
        System.out.println("Miniumum: " + min + ", " + "Maximum:" + max);

    }
}
