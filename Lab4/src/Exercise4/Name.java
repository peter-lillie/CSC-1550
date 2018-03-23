package Exercise4; // located in the Exercise4 package

//***************************************
// Name
//
// This is a constructor class that
// modifies names
//
// Contributors: Peter Lillie and Kyle White
//
//***************************************

public class Name {
    //Initialize variables
    String firstName, middleName, lastName;

    // Contstructor class
    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    // the next three functions are pretty extraneous cause we do nto use them
    public String getFirstName() {
        return(firstName);
    }

    public  String getMiddleName() {
        return(middleName);
    }

    public String getLastName() {
        return(lastName);
    }

    // format the name in various ways
    public String firstMiddleLast() {
        return(firstName + " " + middleName + " " + lastName);
    }

    public String lastFirstMiddle() {
        return(lastName + ", " + firstName + " " + middleName);
    }

    // this compares the names
    public boolean equals(String name, String otherName) {
        if(name.equalsIgnoreCase(otherName)) {
            System.out.println("These names are the same.");
            return(true);
        }
        else {
            System.out.println("These names are not the same.");
            return(false);
        }
    }

    // this guy returns the first letter of each string capitalized
    public String initials() {
        return(firstName.substring(0,1) + middleName.substring(0,1)
                + lastName.substring(0,1)).toUpperCase();
    }

    public String length() {
        return("Length: " + firstMiddleLast().length());
    }

    // this combines all the functions
    public String allTheThings() {
        return(firstMiddleLast()+"\n"+lastFirstMiddle()+"\n"+initials()+"\n"+length());
    }
}
