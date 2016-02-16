package ie.tcd.cs3102;

/**
 * Created by brian on 16/02/2016.
 */
public class MergeSorter {
    public static void sort(int[] a) {
        if (a.length <= 1) { return; }

        int[] left = new int[a.length / 2];
        int[] right = new int[a.length - left.length];

        // Copy left and right array segments
        for (int i = 0; i < left.length; i++) {
            left[i] = a[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = a[left.length + i];
        }

        sort(left);
        sort(right);
        merge(left, right, a);
    }

    private static void merge(int[] left, int[] right, int[] a) {
        int iLeft = 0;
        int iRight = 0;
        int j = 0;

        while (iLeft < left.length && iRight < right.length) {
            if (left[iLeft] < right[iRight]) {
                a[j] = left[iLeft++];
            } else {
                a[j] = right[iRight++];
            }
            j++;
        }
        while (iLeft < left.length) {
            a[j++] = left[iLeft++];
        }
        while (iRight < right.length) {
            a[j++] = right[iRight++];
        }
    }
}
