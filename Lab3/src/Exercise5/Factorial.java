package Exercise5; // Hosted in Exercise5 in Lab3

// ************************************************************
// Factorial.java
//
// Return a factorial given an integer
//
// Contributors: Peter Lille and Kyle White
//
// ************************************************************

import java.util.Scanner; // Import the scanner for input

public class Factorial { // Main class
    public static void main(String args[]) { // Main method
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        String in; // This gives us more input flexibility.
        int userInt = 0, val = 2, total = 1; // Technically there is a more wordy way to do this using 4 variables, but
        // I follow the KISSS principle, Keep It Sane, Simple, and Small
        boolean control = true; // Controls our while loop

        System.out.println("Hey there! Welcome to the factorial calculator!"); // Welcome them

        while(control) { // The loop that keeps asking for input
            //Instructions
            System.out.println("Please enter a non-negative integer, and I will tell you the factorial!");
            try { // We use a try loop just in case they enter something unexpected
                in = scan.nextLine(); // I use scan line for more flexibility
                userInt = Integer.parseInt(in); // Attempts to convert it to an integer
            } catch(Exception e) { // If they enter something unexpected, we try to get an int from them.
                System.out.println("Sorry fam, you gotta use proper ints!"); // Tell them what went wrong
                // Tell them what they can enter
                System.out.println("Try another positive integer input (e.g. 0-" + Integer.MAX_VALUE + ")");
                continue; // Restart the while loop from this point
            }
            // A possible speed improvement in this program would be to have the first 5 or 10 factorials hardcoded,
            // as this would *possibly* be faster than computing it each time.
            if (userInt == 0) { // If it is 0, we know the factorial is 1
                System.out.println("The factorial of 0 is 1"); // Print the known answer
                control = false; // Break the while loop
            } else if (userInt < 0) { // Negatives are not allowed per program requirements
                // Let them know why we cannot process their number
                System.out.println("Sorry, as previously mentioned, I cannot get the factorial of negative integers.");
                continue; // Start the while loop over
            }
            else { // If their input is fine
                while(val <= userInt) { // Set the breaking condition
                    total = total*val; // A simpler way of writing total = number1 * number2
                    val++; // Increment val so we do not get an infinite loop
                }
                System.out.println("The factorial of " + userInt + " is " + total); // Give them the factorial
                break; // End the program
            }
        }
    }
}
