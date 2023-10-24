import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    // How many points to analyse?
	    Scanner in = new Scanner(System.in);
		System.out.println("Enter a number of points:");
		int numberOfPoints = in.nextInt();
		
		// create an arraay to store them (2 because we only
		// have an X and a Y value in 2D points)
		double[][] points = new double[numberOfPoints][2];
		
		// Get all of the points from the user 
		System.out.println("Enter " + numberOfPoints + " points as a list of x and y values separated by whitespace");
		for(int i=0; i<points.length; i++) {
		    points[i][0] = in.nextDouble();
		    points[i][1] = in.nextDouble();
		}
		
		// point1 and point2 will be indeces into the poiints array
        int point1 = 0;
        int point2 = 1;
        
        // shortestDistance will be the shortest distance between the 2
        // closest 2 points in the points array that have been compared 'so far'
        double shortestDistance = 0;
        
        // Initialise everything just using the first 2 elements
        // the function distance() is defined further down the file
        shortestDistance = distance(points[point1][0], points[point1][1],
                                    points[point2][0], points[point2][1]);
                                    
        // Loop the array and compare every point with every other updating the
        // indeces and shortestDistance values as we go along
        for(int i=0; i<points.length; i++) {
            for(int j=i+1; j<points.length; j++) {
                double distance = distance(points[i][0], points[i][1], 
                    points[j][0], points[j][1]);
                
                if(distance < shortestDistance) {
                    point1 = i;
                    point2 = j;
                    shortestDistance = distance;
                }
            }
        }
        
        // Display the result
        System.out.println("The closest 2 points are (" +
            points[point1][0] + ", " + points[point1][1] + ") and (" +
            points[point2][0] + ", " + points[point2][1] + ")");
        
	}
	
	// Function takes 2 points (x1, y1) and (x2, y2) and returns the cartesian
	// distance between them
	public static double distance(double x1, double y1, double x2, double y2) {
	    return Math.sqrt( (x2-x1)*(x2-x1) + (y2 -y1)*(y2 - y1) );
	}
}
