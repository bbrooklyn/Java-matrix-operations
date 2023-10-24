import java.util.Scanner;

public class MatrixDistance3D {
    public static void main(String[] args) {

        // How many points to analyse?
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number of points:");
        int numberOfPoints = in.nextInt();

        // create an array with a length 1 and 3 (x,y,z)
        double[][] points = new double[numberOfPoints][3];

        // Get all of the points from the user
        System.out.println("Enter " + numberOfPoints + " points as a list of x and y values separated by whitespace");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = in.nextDouble();
            points[i][1] = in.nextDouble();
            points[i][2] = in.nextDouble();
        }

        // point1 and point2 will be indeces into the points array
        int point1 = 0;
        int point2 = 1;

        // shortestDistance will be the shortest distance between the 3
        // closest 3 points in the points array that have been compared 'so far'
        double shortestDistance = 0;

        // Initialise everything just using the first 3 elements
        // the function distance() is defined further down the file
        shortestDistance = distance(points[point1][0], points[point1][1], points[point1][2],
                points[point2][0], points[point2][1], points[point2][2]);

        // Loop the array and compare every point with every other updating the
        // indeces and shortestDistance values as we go along
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[i][2],
                        points[j][0], points[j][1], points[j][2]);

                if (distance < shortestDistance) {
                    point1 = i;
                    point2 = j;
                    shortestDistance = distance;
                }
            }
        }

        // Display the result
        System.out.println("The closest 2 points are (" +
                points[point1][0] + ", " + points[point1][1] + ", " + points[point1][2] + ") and (" +
                points[point2][0] + ", " + points[point2][1] + ", " + points[point2][2] + ")");

    }

    // Function takes 3 points (x1, y1, z1) and (x2, y2, z3) and returns the 3d
    // distance between them
    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 - z1) * (z2 - z1));
    }
}
