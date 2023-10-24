import java.util.Scanner;

public class MatrixAddition {
    public static void printMatrix(double[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                System.out.print(matrix[x][y] + " ");

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        final int MATRIX_SIZE = 3;
        Scanner scan = new Scanner(System.in);

        double[][] matrixA = new double[MATRIX_SIZE][MATRIX_SIZE];
        double[][] matrixB = new double[MATRIX_SIZE][MATRIX_SIZE];

        System.out.println("Matrix A: ");
        for (int y = 0; y < MATRIX_SIZE; y++) {
            String num = scan.nextLine();
            String[] numArray = num.split(" ", 0);
            for (int x = 0; x < MATRIX_SIZE; x++) {

                matrixA[x][y] = Double.parseDouble(numArray[x]);
            }
        }

        System.out.println("Matrix B: ");
        for (int y = 0; y < MATRIX_SIZE; y++) {
            String num = scan.nextLine();
            String[] numArray = num.split(" ", 0);
            for (int x = 0; x < MATRIX_SIZE; x++) {

                matrixB[x][y] = Double.parseDouble(numArray[x]);
            }
        }

        double[][] matrixProduct = new double[MATRIX_SIZE][MATRIX_SIZE];
        for (int y = 0; y < MATRIX_SIZE; y++) {
            for (int x = 0; x < MATRIX_SIZE; x++) {
                matrixProduct[x][y] = matrixA[x][y] + matrixB[x][y];
            }
        }
        printMatrix(matrixProduct);
        scan.close();
    }
}
