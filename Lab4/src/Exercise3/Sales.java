package Exercise3;

//**************************************
// Sales.java
//
// Use BandBooster to manipulate more data
//
// Contributor: Peter Lillie and Kyle White
//
//**************************************

import java.util.Scanner; // We use this a few times
public class Sales {
    public static void main(String[] args) { // makes this script runnable
        // initialize variables
        Scanner scan = new Scanner(System.in);
        String name1, name2; // booster names as given by the end user
        int s1=0, s2=0; // sales per booster. Abbreviated.
        boolean condition=true; // Helps us control the while loop

        // prompt for names
        System.out.println("Please enter the names of the two Band Boosters, separated by a return");
        name1 = scan.nextLine();
        name2 = scan.nextLine();
        // create the boosters, with starting sales at 0
        BandBooster bandB1 = new BandBooster(name1, s1);
        BandBooster bandB2 = new BandBooster(name2, s2);
        // add sales they made over three weeks
        while(condition) { // wait until the user puts in valid ints
            try { // makes this a little robust
                System.out.println("Enter the number of boxes " + bandB1.getName() + " has sold:");
                s1 = scan.nextInt();
                System.out.println("Enter the number of boxes " + bandB2.getName() + " has sold:");
                s2 = scan.nextInt();
                condition=false; // get out of the loop
            } catch(Exception e) {
                System.out.println("You entered an unexpected value."); // did not use an int
                scan.nextLine();
            }
        }
        // add the new sales
        bandB1.updateSales(s1);
        bandB2.updateSales(s2);
        // print the information
        System.out.println(bandB1.toString());
        System.out.println(bandB2.toString());
    }
}
