package MatrixCalc;

public class Determinant {
    public static double det(double[][] a) {
        double temp[][];
        double det = 0;

        if (a.length == 1) {
            det = a[0][0];
            return (det);
        }

        if (a.length == 2) {
            det = ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
            return (det);
        }

        for (int i = 0; i < a[0].length; i++) {
            temp = new double[a.length][a[0].length];

            for (int j = 1; j < a.length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    if (k < i) {
                        temp[j][k] = a[j][k];
                    } else if (k > i) {
                        temp[j - 1][k - 1] = a[j][k];
                    }
                }
            }

            det += a[0][i] * Math.pow (-1, (double) i) * det(temp);
        }
        return (det);
    }
}
