package Exercise3; // Located in the package Exercise3

//******************************
// BandBooster.java
//
// Create the young blood.
//
// Contributor: Peter Lillie, and
// Kyle White
//
//******************************


public class BandBooster {
    String name; // Used to store the name
    int boxesSold; // Used to store the boxes sold prior to the program

    public BandBooster(String boosterName, int sold) { // our constructor
        name = boosterName; // name of the booster
        boxesSold = sold; // how many they sold prior to the script default is 0
    }

    public String getName() { // returns the name in a convenient way
        return(name);
    }

    public int updateSales(int boxes) { // add the boxes they sold after the script
        return(boxesSold += boxes);
    }

    public String toString() { // creates an easy to read sales report
        return(getName() + ": " + boxesSold + " boxes");
    }
}
