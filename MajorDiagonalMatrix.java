import java.util.Scanner;

public class MajorDiagonalMatrix {
    public static void printMatrix(double[][] matrix) {
        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                System.out.print(matrix[x][y] + " ");

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        for (int y = 0; y < 4; y++) {

            String num = scan.nextLine();
            String[] numArray = num.split(" ", 0);

            for (int x = 0; x < 4; x++) {

                matrix[x][y] = Double.parseDouble(numArray[x]);
            }

        }
        printMatrix(matrix);
        double average = 0;

        for (int y = 0; y < 4; y++) {
            average += matrix[y][y];

            System.out.println(y);

        }
        average = average / 4;
        System.out.println("The average of the elements in the major diagonal is " + average);
        scan.close();
    }
}
