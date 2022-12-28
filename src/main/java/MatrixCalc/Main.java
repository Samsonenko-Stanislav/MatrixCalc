package MatrixCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int oper;
        Scanner in = new Scanner(System.in);
        System.out.println("(С) Матричный калькулятор. Самсоненко Станислав Владимирович, 2022");
        while (true){
            System.out.println("Выберите необходимую операцию:");
            System.out.println("1 - сложение матриц");
            System.out.println("2 - скалярное умножение");
            System.out.println("3 - умножение матриц");
            System.out.println("4 - вычисление определителя");
            System.out.println("5 - транспонирование матрицы");
            System.out.println("6 - нахождение обратной матрицы");
            oper = in.nextInt();
            switch (oper){
                case 1:
                    Addition.addition();
                    break;
                case 2:
                    ScalMult.scalMult();
                    break;
                case 3:
                    Multiplication.multiplication();
                    break;
                case 4:
                    Determinant.determinant();
                    break;
                case 5:
                    Transposition.transposition();
                    break;
                case 6:
                    Inversion.inversion();
                    break;
                default:
                    return;

            }
        }

    }
}
