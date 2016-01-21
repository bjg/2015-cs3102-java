package ie.tcd.cs3102.arrays2;

public class Main {

    public static void main(String[] args) {
	    double[][] mat;

        mat = new double[10][4];

        mat[0][0] = 1.0;
        mat[0][1] = 2.0;

        mat[1][0] = 3.0;
        mat[1][1] = 4.0;

        System.out.println(matrixToString(mat));

    }

    private static String matrixToString(double[][] mat) {
        String s = "[ ";

        for (int i = 0; i < mat.length; i++) {
            if (i != 0) { s += ", "; }
            s += "[";
            for (int j = 0; j < mat[0].length; j++) {
                if (j != 0) { s += ", "; }
                s += mat[i][j] + "";
            }
            s += "]";
        }

        return s;
    }
}
