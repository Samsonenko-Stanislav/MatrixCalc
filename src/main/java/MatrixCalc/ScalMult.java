package MatrixCalc;

import java.util.Scanner;

public class ScalMult {
    public static double [][] mult(double b, double[][] a) {
        double[][] c = new double[a.length][a[0].length];
        System.out.println(a[0].length + " " + a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] * b;
            }
        }
        return c;
    }
    public static void scalMult(){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числовой множитель:");
        int b = in.nextInt();
        System.out.println("Введите размерность матрицы:");
        int n = in.nextInt();
        int m = in.nextInt();
        double[][] a = new double[n][m];
        System.out.println("Введите первую матрицу:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        double[][] c = mult(b, a);
        print(c);
    }
    private static void print(double[][] c) {
        System.out.println("Результат скалярного умножения:");
        for (double[] doubles : c) {
            for (int j = 0; j < c[0].length; j++)
                System.out.print(doubles[j] + " ");
            System.out.println();
        }
    }
}
