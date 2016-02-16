package ie.tcd.cs3102.words;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    static final int NUMWORDS = 235886;
    static final String FILENAME = "shuffled.txt";

    public static void main(String[] args) {
        String []words = readWords(FILENAME, NUMWORDS);

        // 1. Write code to test method findShortest()
        System.out.println(findShortest(words));

        // 2. Write code to test method findLongest()
        System.out.println(findLongest(words));

        // 3. Write code to test method meanWordLength()
        System.out.println(meanWordLength(words));

        // 4. Write code to test method frequencyDistribution()
        double fdt[][] = frequencyDistribution(words);
        printFdt(fdt);

        // 5. Write code to test method sortedWords()
        String[] slice = new String[10000];
        for (int i  = 0; i < slice.length; i++) {
            slice[i] = words[i];
        }
        String[] sorted = sortedWords(slice);
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i - 0].compareTo(sorted[i]) > 0) {
                System.err.println("Error: found unsorted element at " + i);
            }
        }

        // 6. Write code to test method removeFourLetterWords()
        removeFourLetterWords(words);
        fdt = frequencyDistribution(words);
        printFdt(fdt);
    }

    // 1. Write code to find the shortest and longest word in the list (5 Marks)
    private static String findShortest(String[] words) {
        String shortest = words[0];

        for (String w : words) {
            if (w != null && w.length() < shortest.length()) {
                shortest = w;
            }
        }

        return shortest;
    }

    // 2. Write code to find the shortest and longest word in the list (5 Marks)
    private static String findLongest(String[] words) {
        String longest = words[0];

        for (String w : words) {
            if (w != null && w.length() > longest.length()) {
                longest = w;
            }
        }
        return longest;
    }

    // 3. Write code to find the average word length (10 Marks)
    private static double meanWordLength(String[] words) {
        double mwl = 0.0;

        for (String w : words) {
            mwl += w.length();
        }

        return mwl / words.length;
    }

    // 4. Write code to build a frequency distribution of words lengths in the list (20 Marks)
    //    Hint: You need to build a two-dimensional array of the form:
    //          [ [1, p], [2, q], [3, e], ... ]
    //          where p, q, r are integer word counts for words of length 1, 2, 3 respectively
    private static double[][] frequencyDistribution(String[] words) {
        double[][] fdt;

        double freqs[] = new double[findLongest(words).length() + 1];
        for (String w: words) {
            if (w != null) { freqs[w.length()]++; }
        }
        int count = 0;
        for (double f : freqs) {
            if (f > 0) { count++; }
        }
        fdt = new double[count][2];
        int i = 0;
        for (int j = 1; j < freqs.length; j++) {
            if (freqs[j] > 0) {
                fdt[i][0] = j;
                fdt[i][1] = freqs[j];
                i++;
            }
        }
        return fdt;
    }


    // 5. Write code to build a sorted version of the list (in ascending order) (40 Marks)
    //    Hint: Build a copy of the original array but in sorted order
    private static String[] sortedWords(String[] words) {
        String[] sorted = new String[words.length + 1];

        sorted[0] = words[0];
        for (String w : words) {
            insertWord(sorted, w);
        }

        return sorted;
    }

    // 6. Write code to remove all four-letter words from the original list (20 Marks)
    private static void removeFourLetterWords(String[] words) {
        int i = 0;
        while (i < words.length && words[i] != null) {
            if (words[i].length() == 4) {
                removeWord(words, i);
                // Don't advance the index if we've removed a word here
                continue;
            }
            i++;
        }
    }


    // Helper: Insert a word into string array (updating the original array)
    private static void insertWord(String[] dest, String newVal) {
        int i = 0;
        while (i < dest.length && dest[i] != null) {
            if (newVal.compareTo(dest[i]) < 0) {
                shiftRight(dest, i);
                break;
            }
            i++;
        }
        dest[i] = newVal;
    }

    // Helper: Remove a word from a string array (updating the original array)
    private static void removeWord(String[] src, int from) {
        shiftLeft(src, from);
    }

    private static void shiftLeft(String[] dest, int from) {
        for (int i = from + 1; i < dest.length; i++) {
            dest[i - 1] = dest[i];
        }
        dest[dest.length - 1] = null;
    }

    private static void shiftRight(String[] dest, int from)  {
        for (int i = dest.length - 2; i >= from; i--) {
            dest[i + 1] = dest[i];
        }
    }

    private static void printFdt(double[][] fdt) {
        for (int i = 0; i < fdt.length; i++) {
            System.out.print("[" + (int)fdt[i][0] + ", " + (int)fdt[i][1] + "] ");
        }
        System.out.println();
    }

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
