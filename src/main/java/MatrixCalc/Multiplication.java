package MatrixCalc;

import java.text.MessageFormat;
import java.util.Scanner;

public class Multiplication {
    public static void multiplication(){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матриц:");
        int n = in.nextInt();
        int m = in.nextInt();
        double[][] a = new double[n][m];
        double[][] b = new double[n][m];
        System.out.println("Введите первую матрицу:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        System.out.println("Введите вторую матрицу:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                b[i][j] = in.nextInt();
            }

        double[][] c = mult(a, b);
        print(c);
    }
    public static double[][] mult (double[][] a, double[][] b) {
        double[][] c;
        c = new double[a.length][b[0].length];

        if (a[0].length != b[0].length) {
            throw new IllegalArgumentException (
                    MessageFormat.format ("Матрицы не могут быть перемножены: {0} != {1}.", a[0].length, b.length));
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        return (c);
    }
    private static void print(double[][] c) {
        System.out.println("Результат умножения:");
        for (double[] doubles : c) {
            for (int j = 0; j < c[0].length; j++)
                System.out.print(doubles[j] + " ");
            System.out.println();
        }
    }
}
