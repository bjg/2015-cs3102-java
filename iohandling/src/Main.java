/**
 * Created by brian on 08/12/2015.
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * -i infile -o outfile
 */

public class Main {
    public static void main(String args[]) {

        String infile = null, outfile = null;

        if (args.length == 1) {
            if (args[0].compareTo("-h") == 0) {
                usage();
                return;
            }
        }

        for (int i = 0; i < args.length;) {
            if (args[i].compareTo("-i") == 0 && i + 1 < args.length) {
                infile = args[i + 1];
                i += 2;
            } else if (args[i].compareTo("-o") == 0 && i + 1 < args.length) {
                outfile = args[i + 1];
                i += 2;
            } else {
                i++;
            }
        }

        if (infile == null || outfile == null) {
            usage();
            return;
        }

        File inputFile = new File(infile);
        Scanner in;
        PrintWriter out;

        try {
            in = new Scanner(inputFile);
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error: File '" + infile + "' not found for reading");
            return;
        }
        try {
            out = new PrintWriter(outfile);
        } catch (java.io.FileNotFoundException e) {
            System.err.println("Error: File '" + outfile + "' not available for writing");
            return;
        }

        for (int i = 1; in.hasNextLine(); i++) {
            String line = in.nextLine();

            out.println(i + " " + line);
        }
        out.close();
    }

    private static void usage() {
        System.err.println("Usage: copy -h | copy -i infile -o outfile");

    }
}
