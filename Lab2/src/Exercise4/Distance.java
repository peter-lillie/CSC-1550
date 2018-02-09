package Exercise4;

// ************************************************************
// Distance.java
//
// Computes the distance between two points
//
// Contributors: Ricky Sethi, Peter Lillie, Kyle White
//
// ************************************************************

import java.util.Scanner;
import java.awt.geom.Point2D;
import java.text.DecimalFormat;

public class Distance
{
    public static void main (String[] args)
    {
        double x1, y1, x2, y2; // coordinates of two points
        String distance; // distance between the points
        Scanner scan = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.000");

        // Read in the two points
        System.out.print ("Enter the coordinates of the first point " +
                "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();

        System.out.print ("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        // Compute the distance
        distance = d.format(Point2D.distance(x1, y1, x2, y2));
        // I used the Point2D distance formula for 100% accuracy, and I used the format method so that
        // distance is only printed out to the 3rd decimal place. Technically it would be better practice to
        // format the string in line, since the method I used above will create a lossy variable, however,
        // in this case it does not really matter.

        // Print out the answer
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance);
    }
}
