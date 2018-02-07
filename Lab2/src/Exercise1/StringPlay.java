package Exercise1; // StringPlay is located in the Package Exercise 1
// **************************************************
// StringPlay.java
//
// Play with String objects
//
// Contributors: Ricky Sethi, Peter Lillie, and Kyle
// White
// **************************************************
public class StringPlay // Declaring the parent class
{
    public static void main (String[] args) // Declaring the main method of StringPlay
    {
        // Initialize our string variables (a)
        String change1, change2, change3;
        // Technically a university but whatever...
        String college = new String ("Fitchburg State University"); // Initialize the college var with the name of the university
        // Technically a city but okay :)
        String town = new String ("Fitchburg, MA"); // Initialize the town variable with the colleges town name

        // The .length() method returns whitespaces too, so keep that in mind for future Labs
        int stringLength = college.length(); // Get the length of the college variable. (b)
        System.out.println (college + " contains " + stringLength + " characters.");

        // Make some changes to the String that we do nothing with XD
        change1 = college.toUpperCase(); // Convert all the characters to UPPERCASE (c)
        change2 = college.toUpperCase().replace('F','*'); // Make the F dirty ;) (d)
        change3 = college.concat(", " + town); // Concatenate the whole thing! part (e)

        // Print our final result
        System.out.println ("The final string is " + change3); // Make sure we are right!
    }
}
