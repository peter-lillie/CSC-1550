package ExpandedExercises;

/**
 * Rock.java
 *
 * Play rock, paper, scissors with the user.
 *
 * The player enters a R, P, or S, and then the computer replies with a value between 0-2,
 * which correspond to 0 - Rock, 1 - Paper, 2 - Scissors
 *
 */

import java.util.Scanner; // We use this to get user's input
import java.util.Random; // We use this to get the computer's guess

public class Rock {
    public static void main(String[] args) {
        String personPlay, computerPlay = ""; // User's play or the computer's play -- "R", "P", or "S"
        int computerInt; // Randomly generated number used to determine computer's play
        Scanner scan = new Scanner(System.in); // Initialize the scanner
        Random generator = new Random(); // Initialize the random number generator

        //Get player's play -- note that this is stored as a string
        System.out.println("Can you choose randomly better than a computer???");
        System.out.println("Let's find out! Rock, Paper, Scissors?");
        System.out.print("Please enter 'R', 'P', or 'S'.");
        personPlay = scan.nextLine().toUpperCase();

        //Make player's play uppercase for ease of comparison
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(2);

        //Translate computer's randomly generated play to string
        switch (computerInt) {
            case 0:
                computerPlay = "R";
                break;
            case 1:
                computerPlay = "P";
                break;
            case 2:
                computerPlay = "S";
                break;
            default:
                System.out.println("Sorry, the computer gave an unexpected value!");
                break;
        }

        // Print computer's play
        System.out.println("You guessed " + personPlay + ".");
        System.out.println("The computer guessed " + computerPlay + ".");

        // We determine who won using a series of nested "ifs". If would be more effecient to use an if statement in this
        // case, however it was requested by the requirements that nested if statements be used.
        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        }
        else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors.You win!!");
            }
            else if (computerPlay.equals("P")) {
                System.out.println("Paper covers rock, you lose!");
            }
            else if (computerPlay.equals("R")) {
                System.out.println("It's a tie!");
            }
        }
        else if (personPlay.equals("P")) {
            if (computerPlay.equals("S")) {
                System.out.println("Scissors cut paper.You lose!");
            }
            else if (computerPlay.equals("R")) {
                System.out.println("Paper covers rock, you win!");
            }
            else if (computerPlay.equals("P")) {
                System.out.println("It's a tie!");
            }
        }
        else if (personPlay.equals("S")) {
            if (computerPlay.equals("R")) {
                System.out.println("Rock crushes scissors. You lose!");
            }
            else if (computerPlay.equals("P")) {
                System.out.println("Scissors cut paper, you win!");
            }
            else if (computerPlay.equals("S")) {
                System.out.println("It's a tie!");
            }
        }
    }
}
