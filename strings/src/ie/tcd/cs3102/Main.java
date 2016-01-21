package ie.tcd.cs3102;

import java.util.Scanner;

public class Main {


    /*
     * 1. Obvious substring case
     * 2. Look for something not in source
     * 3. Boundary condition start of string
     * 4. Boundary condition end of string
     */
    public static void main(String[] args) {
        String source = "The All Blacks are tournament favourites";
        String target = "name";


        System.out.println(compareStrings(source, target));

        /*
        double temp = readValue("Enter a temperature: ", 0.0, 100.0);
        System.out.println(temp);

        double pressure = readValue("Enter a pressure: ", 500.0, 1000.0);;
        System.out.println(pressure);
        */

        int i = 3;
        int j = 4;
        System.out.println(add(i, j));
        System.out.println(i);

        String s = "some message";
        printMessage(s);
        System.out.println(s);
    }

    public static double readValue(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double val;
        do {
            System.out.print(prompt);
            val = scanner.nextDouble();
        } while (val < min || val > max);
        return val;
    }

    public static void printMessage(String msg) {
        System.out.println(msg);
        msg = "another message";
    }

    public static int add(int a, int b) {
        a = a + b;
        return a;
    }

    public static boolean greaterThan(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean compareStrings(String source, String target) {
        // Extract loop invariants
        int slen = source.length();
        int tlen = target.length();
        for (int i = 0; i <= slen - tlen; i++) {
            String s = source.substring(i, i + tlen);
            if (s.compareTo(target) == 0) {
                return true;
            }
        }
        return false;
    }
}

