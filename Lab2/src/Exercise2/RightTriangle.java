package Exercise2; // RightTriangle is located in Java Package Exercise2
// *******************************************************************
// RightTriangle.java
//
// Compute the length of the hypotenuse of a right triangle
// given the lengths of the sides
//
// Contributors: Ricky Sethi, Peter Lillie, and Kyle
// White
// *******************************************************************

import java.util.Scanner; // Import the Scanner to get user input
import java.lang.Math; // Import Math for hypotenuse
import java.util.ArrayList; // To keep track of the users searches

public class RightTriangle // Create the main class, RightTriangle
{
    public static void main (String[] args) // Initialize the main method
    {

        String input, start_over; // Technically we could require the user to enter a double, but I'd rather make the program more robust
        double side1 = 0, side2 = 0, hypotenuse, t = 0; // Lengths of the sides of a right triangle, length of the hypotenuse
        Scanner scan = new Scanner(System.in); // Create the scanner to get user input
        ArrayList<String> prev_searches = new ArrayList<>(); // An array to hold the user's calculation history
        boolean b = true; // The while loop control

        while (b) { // A loop to allow the user to enter more than 1 input

            boolean c3 = true;

            // Get the lengths of the sides as input
            System.out.print("Please enter the lengths of the two sides of a right triangle (separate by a blank space): "); // Prompt for input
            input = scan.nextLine(); // Get the input
            String[] array = input.split(" "); // Splitting the numbers by whitespace

            for (String w : array) { // Putting the numbers in their proper variables

                if (t == 0) { // t is just a ticker variable to tell us which side to assign the input

                    try { // Makes the program kinda robust
                        side1 = Double.parseDouble(w); // Convert side1
                        t = 1; // Change the ticker value
                    } catch (Exception e) { // If it is a letter or something.
                        System.out.println(e); // Let them know the error
                        System.out.println("Sorry, that's an error! :("); // Tell them that the program is dying
                        System.out.println("Try another set of numbers, and make sure they are in the format: 0.0 0.0"); // Tell them how to properly put the numbers in
                        t = 404;
                        break;
                    }

                } else if (t == 1) { // Ticker trick again

                    try {
                        side2 = Double.parseDouble(w); // See notes on the above try loop
                        t++;
                    } catch (Exception e) {
                        System.out.println(e);
                        System.out.println("Sorry, that's an error! :(");
                        System.out.println("Try another set of numbers, and make sure they are in the format: 0.0 0.0");
                        t = 404; // Let's the program know that something is wrong and the user needs to put in input again
                        break;
                    }

                } else {
                    System.out.println("Whoah there, don't need all those numbers! Thanks though :)");
                }
            }

            if(t != 404) { // Make sure there are no errors in the numbers
                // Compute the length of the hypotenuse
                // Print the result
                hypotenuse = Math.hypot(side1, side2); // Calculate the hypotenuse
                t = 0; // Reset the t value
                System.out.println("Length of the hypotenuse: " + hypotenuse); // Print the hypotenus e
                prev_searches.add(String.valueOf("Hypotenuse:" + hypotenuse).concat(String.valueOf("\nSide 1: " + side1 + "\nSide2: " + side2 + "\n"))); // Add the hypotenuse to the prev searches

            } else { // If it is an error
                t = 0; // Reset the t value
            }

            System.out.println("Would you like to enter a new set of values or retrieve your search history?"); // Ask the user what they want to do

            while(c3) { // Keep asking the user until they put something in that works.
                System.out.print("y, yes: restart calculator \nn, no: exit calculator \nh, history: view previous searches"); // Show the user some options
                input = scan.nextLine(); // Get the input

                switch (input) { // A switch to figure out what we are gonna do next
                    case "y": // They want to start again
                    case "yes":
                        c3 = false; // Break out of the inner while loop
                        break; // Break out of the switch statement
                    case "n": // They want to quit
                    case "no":
                        c3 = false;
                        b = false; // Break out of the outer loop
                        break;
                    case "h": // They want to see what they have searched
                    case "history":
                        for (String e : prev_searches) { // Print out all of their previous queries
                            System.out.println(e); // Printing statement
                        }
                        break;
                    default: // They put in something weird
                        System.out.println("Not sure what you mean there...");
                        System.out.println("Please enter one of the acceptable commands.");
                        break;
                }
            }
        }
    }
}
