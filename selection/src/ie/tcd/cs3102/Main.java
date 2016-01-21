package ie.tcd.cs3102;

import java.util.Scanner;

public class Main {

    enum FilingStatus
        {SINGLE, MARRIED, MARRIED_FILING_SEPARATELY };

    public static void main(String[] args) {
	    // write your code here


        int a = 10;
        int b = 5;
        int c = 5;
        int d = 5;

        /*
        if (a > 0) {
            System.out.println("x");
        } else {
            if (b > 5) {
                System.out.println("y");
            } else {
                System.out.println("z");
            }
        }
        */

        if (a == 1) {
            // Do something when a is 1
        } else if (b == 2) {
            // Do something when b is 2
        } else if (c == 3) {
            // Do something when c is 3
        } else if (d == 4) {
            // Do something when d is 4
        } else {
            // Do something when a is none of these
        }

        if (a > 10);
        {
            //System.out.println("z");
        }

        if (b > 10)
            ;
        else {
            // do something when b is <= 10
        }

        boolean result = a > 10;
        if (result) {

        }

        int n = a > 0 ? (b > 10 ? 200 : -200) : -100;
        //System.out.println("Ternary: " + n);

        if (a > 0) {
            n = 100;
        } else {
            n = -100;
        }

        String s = "Hello, world";
        int len = s.length();

        for (int i = 0; i < len; i++) {
            System.out.print(s.charAt(i) + "  ");
        }

        String source = "The All Blacks are tournament favourites";
        String target = "favourite";

        for (int i = 0;
             i < source.length() - target.length();
             i++) {
            if (source.substring(i, i + target.length() - 1).compareTo(target) == 0) {
                break;
            }
        }
    }
}
