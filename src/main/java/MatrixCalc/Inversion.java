package MatrixCalc;

import java.text.MessageFormat;
import java.util.Scanner;

import static MatrixCalc.Determinant.det;
import static MatrixCalc.ScalMult.mult;
import static java.lang.Math.pow;

public class Inversion {
    public static void inversion() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы:");
        int n = in.nextInt();
        int m = in.nextInt();
        if (n != m){
            System.out.println("Обратная матрица не существует, так как исходная не квадратная");
            return;
        }
        double[][] a = new double[n][m];
        System.out.println("Введите матрицу:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        double[][] b = inverse(a);
        print(b);
    }

    public static double [][] complement(double[][] a){
        double[][] complements = new double[a.length][a[0].length];
        for (int i = 0; i <a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                double [][] t = new double[a.length-1][a[0].length - 1];
                int l1 = 0;
                int l2 = 0;
                for (int k = 0; k < a.length; k++){
                    for (int m = 0; m < a[0].length; m++){
                        if ((k != i) && (j != m)) {
                            t[l1][l2] = a[k][m];
                            l2++;
                            if (l2 == a[0].length -1) {
                                l1++;
                                l2 = 0;
                            }
                        }

                    }
                }
                double complement = pow(-1, i+ j)* det(t);
                System.out.println(complement);
                complements[i][j] = complement;
            }
        }
        return complements;
    }
    public static double [][] inverse(double [][] a){
        double det = det(a);
        if (det == 0){
            System.out.println("Обратная матрица не существует, так определитель равен 0");
        }

        double [][] b  = mult(1/det, Transposition.t(complement(a)));
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
