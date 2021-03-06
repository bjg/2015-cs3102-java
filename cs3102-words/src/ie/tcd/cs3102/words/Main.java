package ie.tcd.cs3102.words;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    static final int NUMWORDS = 235886;
    static final String FILENAME = "shuffled.txt";

    public static void main(String[] args) {
        String []words = readWords(FILENAME, NUMWORDS);

        // 1. Write code to test method findShortest()

        // 2. Write code to test method findLongest()

        // 3. Write code to test method meanWordLength()

        // 4. Write code to test method frequencyDistribution()

        // 5. Write code to test method sortedWords()

        // 6. Write code to test method removeFourLetterWords()
    }

    /*
    // 1. Write code to find the shortest and longest word in the list (5 Marks)
    private static String findShortest(String[] words) {
        String shortest;

        // Your code goes here ...

        return shortest;
    }

    // 2. Write code to find the shortest and longest word in the list (5 Marks)
    private static String findLongest(String[] words) {
        String longest;

        // Your code goes here ...

        return longest;
    }

    // 3. Write code to find the average word length (10 Marks)
    private static double meanWordLength(String[] words) {
        double mwl;

        // Your code goes here ...

        return mwl;
    }

    // 4. Write code to build a frequency distribution of words lengths in the list (20 Marks)
    //    Hint: You need to build a two-dimensional array of the form:
    //          [ [1, p], [2, q], [3, e], ... ]
    //          where p, q, r are integer word counts for words of length 1, 2, 3 respectively
    private static double[][] frequencyDistribution(String[] words) {
        double[][] fdt;

        // Your code goes here ...

        return fdt;
    }

    // 5. Write code to build a sorted version of the list (in ascending order) (40 Marks)
    //    Hint: Build a copy of the original array but in sorted order
    private static String[] sortedWords(String[] words) {
        String[] sorted;

        // Your code goes here ...

        return sorted;
    }


    // 6. Write code to remove all four-letter words from the original list (20 Marks)
    private static void removeFourLetterWords(String[] words) {

        // Your code goes here ...

        return;
    }

    // Helper: Insert a word into string array (updating the original array)
    private static void insertWord(String[] words, String wordToInsert) {

        // Your code goes here ...

        return;
    }

    // Helper: Remove a word from a string array (updating the original array)
    private static void removeWord(String[] words, String wordToRemove) {

        // Your code goes here ...

        return;
    }
    */

    // Helper: Read the words list from a file into a string array
    private static String[] readWords(String filename, int count) {
        String[] words = new String[count];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int i = 0;
            for (String line; (line = br.readLine()) != null && i < count;) {
                words[i++] = line;
            }
        } catch (java.io.IOException e) {
            System.err.println("File: " + filename + " could not be found.");
        }
        return words;
    }
}
