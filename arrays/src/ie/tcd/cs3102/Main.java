package ie.tcd.cs3102;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        int i = insertIntInto(numbers, 5);
        System.out.println(i + " " + intArrayToString(numbers));

        i = insertIntInto(numbers, 4);
        System.out.println(i + " " + intArrayToString(numbers));

        numbers = expandIntArray(numbers, 20);

        i = insertIntInto(numbers, 6);
        System.out.println(i + " " + intArrayToString(numbers));

        i = removeIntFrom(numbers, 4);
        System.out.println(i + " " + intArrayToString(numbers));

        i = removeIntFrom(numbers, 6);
        System.out.println(i + " " + intArrayToString(numbers));

        i = removeIntFrom(numbers, 7);
        System.out.println(i + " " + intArrayToString(numbers));
    }

    public static int insertIntInto(int[] dest, int newVal) {
        for (int i = 0; i < dest.length; i++) {
            if (newVal > dest[i]) {
                shiftRight(dest, i);
                dest[i] = newVal;
                return i;
            }
        }
        return -1;
    }

    public static void shiftRight(int[] dest, int from)  {
        for (int i = dest.length - 2; i >= from; i--) {
            dest[i + 1] = dest[i];
        }
    }

    public static int removeIntFrom(int[] src, int existingVal) {
        int i = findIntInArray(src, existingVal);
        if (i != -1) {
            shiftLeft(src, i);
            return i;
        }
        return -1;
    }

    public static void shiftLeft(int[] dest, int from) {
        for (int i = from + 1; i < dest.length; i++) {
            dest[i - 1] = dest[i];
        }
        dest[dest.length - 1] = 0;
    }

    public static int findIntInArray(int[] src, int targetVal) {
        for (int i = 0; i < src.length; i++) {
            if (targetVal == src[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int[] expandIntArray(int[] src, int newLen) {
        int[] out = new int[newLen];
        intArrayCopy(src, out);
        return out;
    }

    public static void intArrayCopy(int[] from, int[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    public static String intArrayToString(int[] values) {
        String s = "[";
        for (int i = 0; i < values.length; i++) {
            if (i != 0) {
                s += ", ";
            }
            s += values[i];
        }
        s += "]";
        return s;
    }
}
