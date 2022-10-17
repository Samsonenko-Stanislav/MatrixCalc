package MatrixCalc;

import java.util.Scanner;

public class Transposition {
    public static void transposition(){
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
        double[][] T = t(a);
        print(T);
    }
    public static double[][] t(double[][] a) {
        double[][] T = new double[a[0].length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                T[j][i] = a[i][j];
            }
        return T;
    }
        public static void print(double[][] c) {
            System.out.println("Транспонированная матрица равна:");
            for (double[] doubles : c) {
                for (int j = 0; j < c[0].length; j++)
                    System.out.print(doubles[j] + " ");
                System.out.println();
            }
        }
}
