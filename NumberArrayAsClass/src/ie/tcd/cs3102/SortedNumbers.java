package ie.tcd.cs3102;

import java.util.Arrays;

/**
 * Created by brian on 26/01/2016.
 */
public class SortedNumbers implements SortedStuff {
    private int[] values;
    private int capacity;
    private int size;

    private static final int DEFAULT_SIZE = 10;

    public SortedNumbers() {
        this(DEFAULT_SIZE);
    }

    public SortedNumbers(int capacity) {
        values = new int[capacity];
        this.capacity = capacity;
    }

    public int insert(int newVal) {
        if (size == capacity) {
            capacity *= 2;
            values = Arrays.copyOf(values, capacity);
        }
        for (int i = 0; i < values.length; i++) {
            if (newVal > values[i]) {
                shiftRight(i);
                values[i] = newVal;
                size++;
                return i;
            }
        }
        return -1;
    }

    public void remove(int at) {
        if (at < size) {
            shiftLeft(at);
            size--;
        }
    }

    public int size() {
        return size;
    }

    public  String toString() {
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

    private void shiftRight(int from)  {
        for (int i = values.length - 2; i >= from; i--) {
            values[i + 1] = values[i];
        }
    }

    private void shiftLeft(int from) {
        for (int i = from + 1; i < values.length; i++) {
            values[i - 1] = values[i];
        }
        values[values.length - 1] = 0;
    }

}
