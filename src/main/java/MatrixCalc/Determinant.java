package MatrixCalc;

import java.util.Scanner;

public class Determinant {
    public static void determinant(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");
        int n = in.nextInt();
        int m = in.nextInt();
        double[][] a = new double[n][m];
        System.out.println("Введите матрицу:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        double det = det(a);
        System.out.println("Определитель матрицы равен "+ det);
    }
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
            temp = new double[a.length - 1][a[0].length - 1];

            for (int j = 1; j < a.length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    if (k < i) {
                        temp[j - 1][k] = a[j][k];
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
