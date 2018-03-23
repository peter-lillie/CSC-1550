package Exercise4; // located in package Exercise4

//***************************************
// TestName
//
// This program uses our class Name and
// handles.
//
// Contributors: Peter Lillie, Kyle White
//
//****************************************

import java.util.Scanner; // we use this to get the names

public class TestNames {
    public static void main(String[] args){
        // Initialize variables
        Scanner scan = new Scanner(System.in);
        String n1f, n1m, n1l, n2f, n2m, n2l;

        // Get the full names for the users
        System.out.println("Please enter a full name:");
        n1f = scan.next();
        n1m = scan.next();
        n1l = scan.next();
        System.out.println("Please enter another full name:");
        n2f = scan.next();
        n2m = scan.next();
        n2l = scan.next();

        // create the objects
        Name name1 = new Name(n1f, n1m, n1l);
        Name name2 = new Name(n2f, n2m, n2l);

        // print the information requested
        System.out.println(name1.allTheThings());
        System.out.println(name2.allTheThings());

        // see if the names are the same
        System.out.println(name1.equals(name1.firstMiddleLast(),name2.firstMiddleLast()));

     }
}
