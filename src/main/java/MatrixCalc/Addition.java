package MatrixCalc;

import java.util.Scanner;

public class Addition {
    static public double [][] add(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];
        System.out.println(a[0].length + " " + a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void addition(){

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

        double[][] c = add(a, b);
        print(c);
    }

    private static void print(double[][] c) {
        System.out.println("Результат сложения:");
        for (double[] doubles : c) {
            for (int j = 0; j < c[0].length; j++)
                System.out.print(doubles[j] + " ");
            System.out.println();
        }
    }
}
