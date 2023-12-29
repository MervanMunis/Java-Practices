// Question 6: String Splitting and Joining
//Write a Java program that takes a sentence as input, splits it into words, and then
// joins the words into a new sentence with a different delimiter.

public class StringSplitter {

    public String splitAndJoin(String sentence, String delimiter) {
        // Splitting the sentence into words
        String[] words = sentence.split(" ");

        // Joining the words with a different delimiter
        return String.join(delimiter, words);
    }

    public void replaceChar(String sentence, String delimiter) {
        String words = sentence.replace(" ", delimiter);
        System.out.println("New Sentence 1: " + words);
    }
}
