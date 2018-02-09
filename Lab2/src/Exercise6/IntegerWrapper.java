package Exercise6;

/**
 * <h1>IntegerWrapper</h1>
 *
 * <h2>Description:</h2>
 * <p>This program takes an integer Integer.MIN_VALUE <= 0 <= Integer.MAX_VALUE and gives the binary, octal, and
 *    hexidecimal representation of the integer. </p>
 *
 * <h2>Methods:</h2>
 * <p>main: only method used in this class.</p>
 *
 * <h2>Variables:</h2>
 * <p>integer: the user defined integer</p>
 *
 * <h2>Packages Used:</h2>
 * <p>Scanner</p>
 *
 */

import java.util.Scanner;

public class IntegerWrapper {

    public static void main(String[] args) {
        int integer; // Our lonely variable, holds the user's input
        Scanner scan = new Scanner(System.in); // Initialize the scanner

        System.out.print("Please enter an integer (P.S. if you want to see something interesting go high): ");
        integer = scan.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(integer));
        System.out.println("Octal: " + Integer.toOctalString(integer));
        System.out.println("Hex: " + Integer.toHexString(integer));

        System.out.println("BTW the max value in Java is: " + Integer.MAX_VALUE);
        System.out.println("And the smallest value is: " + Integer.MIN_VALUE);

        System.out.println("Let me ask you one last thing.");
        System.out.println("If you could add any two integers, what would they be? (One per line please)");
        // Why create a new var when Java is powerful enough to do inline methods???
        System.out.println("Cool the total is: " + Math.addExact(Integer.parseInt(scan.next()), Integer.parseInt(scan.next())));


    }

}
