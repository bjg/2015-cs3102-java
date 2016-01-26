package ie.tcd.cs3102;

public class Main {

    public static void main(String[] args) {
        SortedStuff ss = new SortedNumbers();

        for (int n = 10; n <= 120; n += 10) {
            ss.insert(n);
        }

        ss.remove(1);

        System.out.println(ss.toString() + " " + ss.size() + " elements");
    }
}
