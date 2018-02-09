package Exercise3;

// **************************************************
// LuckyNumbers.java
//
// To generate three random "lucky" numbers
//
// Contributors: Ricky Sethi, Peter Lillie, and Kyle
// White
// **************************************************
import java.util.Random;
import java.lang.Math;
public class LuckyNumbers
{
    public static void main (String[] args)
    {
        // Declare our variables
        Random generator = new Random(); // Create a new random seed
        int lucky1, lucky2; // Get the integers ready
        float lucky3; // Get the float ready
        // Generate lucky1 (a random integer between 50 and 79) using the nextInt method (with no parameter)
        lucky1 = Math.abs(generator.nextInt()) % 79 + 50;
        // Generate lucky2 (a random integer between 90 and 100) using the nextInt method with an integer parameter
        lucky2 = generator.nextInt(70) + 30;
        // Generate lucky3 (a random integer between 11 and 30) using nextFloat
        lucky3 = (generator.nextFloat() * 30) + 11;
        System.out.println ("Your lucky numbers are " + lucky1 + ", " + lucky2 + ", and " + lucky3); // Print our results
    }
}
