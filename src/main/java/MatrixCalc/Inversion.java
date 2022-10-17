package MatrixCalc;

import java.text.MessageFormat;
import java.util.Scanner;

public class Inversion {
    public static void inversion() {
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
        double[][] b = inverse(a);
        print(b);
    }
    public static double [][] inverse(double [][] a){
        double det = Determinant.det(a);
        if (det == 0){
            throw new IllegalArgumentException ("Обратная матрица не существует, так определитель равен 0");
        }

        double [][] b  = ScalMult.mult(1/det, Transposition.t(a));
        return b;
    }
    private static void print(double[][] c) {
        System.out.println("Обратная матрица равна:");
        for (double[] doubles : c) {
            for (int j = 0; j < c[0].length; j++)
                System.out.print(doubles[j] + " ");
            System.out.println();
        }
    }


}
