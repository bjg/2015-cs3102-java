package ie.tcd.cs3102;

/**
 * Created by brian on 16/02/2016.
 */
public class SelectionSorter {
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = minimumPos(a, i);
            ArrayUtil.swap(a, minPos, i);
        }
    }

    private static int minimumPos(int[] a, int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < a[minPos]) { minPos = i; }
        }
        return minPos;
    }
}
