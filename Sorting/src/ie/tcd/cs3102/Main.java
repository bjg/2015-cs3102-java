package ie.tcd.cs3102;

import com.sun.scenario.effect.Merge;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Time the selection sort on various sizes of unsorted arrays
        for (int sz : new int[]{10, 20, 30, 40, 50, 60}) {
            int[] rns = ArrayUtil.randomIntArray(sz * 2000, 100000);
            long start = System.currentTimeMillis();
            SelectionSorter.sort(rns);
            long finish = System.currentTimeMillis();
            System.out.println(sz * 2000 + " : " + (finish - start));
        }

        // Compare the (dramatically) faster merge sort on the sizes of unsorted arrays
        for (int sz : new int[]{10, 20, 30, 40, 50, 60}) {
            int[] rns = ArrayUtil.randomIntArray(sz * 2000, 100000);
            long start = System.currentTimeMillis();
            MergeSorter.sort(rns);
            long finish = System.currentTimeMillis();
            System.out.println(sz * 2000 + " : " + (finish - start));
        }
    }
}
