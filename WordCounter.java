import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a text or provide a file to count the words.
        System.out.println("Enter a text or provide a file to count the words:");
        String input = scanner.nextLine();

        // Read the input text or file and store it in a string.
        String text = "";
        try {
            if (new File(input).exists()) {
                text = new String(Files.readAllBytes(Paths.get(input)));
            } else {
                text = input;
            }
        } catch (IOException e) {
            System.out.println("Error reading the input: " + e.getMessage());
            System.exit(1);
        }

        // Count the number of words in the text and display the result to the user.
        int wordCount = countWords(text);
        System.out.println("The total number of words in the text is: " + wordCount);
    }

    private static int countWords(String text) {
        // Split the text into words using spaces and punctuation as delimiters.
        String[] words = text.split("[\\s\\p{Punct}]+");

        // Initialize a counter variable to keep track of the number of words.
        int wordCount = 0;

        // Iterate through the array of words and increment the counter for each word encountered.
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        // Return the total count of words.
        return wordCount;
    }
}