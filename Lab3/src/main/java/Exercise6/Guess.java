package Exercise6; // Hosted in Exercise6 of Lab3

// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// Contributors: Peter Lillie and Kyle White
//
// ************************************************************

import java.util.Scanner; // Import Scanner for input
import java.util.Random; // Import Random to generate a random number

public class Guess { // The main class
    public static void main(String[] args) { // The main method
        int numToGuess; //Number the user tries to guess
        int guess = 0; //The user's guess
        String in; // Adds some flexibility to the program
        boolean condition = true; // Our while loop control
        Scanner scan = new Scanner(System.in); // Initialize the Scanner
        Random generator = new Random(); // Create a random seed
        //randomly generate the number to guess
        numToGuess = generator.nextInt(11);
        //print message asking user to enter a guess
        System.out.println("Would you like to play a game?");
        System.out.println("Please, guess a number between 0-10");
        // Our game loop
        while (condition) { //keep going as long as the guess is wrong
            in = scan.nextLine(); // Get the input
            try { // Try to make it an integer
                guess = Integer.parseInt(in); // Parse the string
            } catch (Exception e) { // Something other than an integer
                System.out.println("Sorry, I was expecting a number! Please try again!"); // Tell them what went wrong
                continue; // Restart the while loop
            }
            if (guess < numToGuess) { // If the user guess was smaller than the number
                // Tell them they guessed too small
                System.out.println("Sorry, that number is too small! Try another number!");
                continue; // Restart the while loop
            }
            else if(guess > numToGuess) { // The user guess was too big
                // Tell them they guessed too small
                System.out.println("Sorry, that number is too big! Try another number!");
                continue; // Restart the while loop
            }
            else if(guess == numToGuess) { // If they got it right
                // Tell them they won
                System.out.println("CONGRATS!!! You won " +  Integer.MAX_VALUE + " imaginary points!");
                condition = false; // End the while loop and exit
            }
            else { // This should not happen. If it does Java is on a new version or something XD
                System.out.println("Sorry, something went wrong :( Try another number..."); // Oh boy...
            }
        }
    }
}