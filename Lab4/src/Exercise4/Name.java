package Exercise4;

public class Name {
    String firstName, middleName, lastName;

    public Name(String first, String middle, String last) {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    public String getFirstName() {
        return(firstName);
    }

    public  String getMiddleName() {
        return(middleName);
    }

    public String getLastName() {
        return(lastName);
    }

    public String firstMiddleLast() {
        return(firstName + " " + middleName + " " + lastName);
    }

    public String lastFirstMiddle() {
        return(lastName + ", " + firstName + " " + middleName);
    }

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

    public String initials() {
        return(firstName.substring(0,1) + middleName.substring(0,1)
                + lastName.substring(0,1)).toUpperCase();
    }

    public String length() {
        return("Length: " + firstMiddleLast().length());
    }

    public String allTheThings() {
        return(firstMiddleLast()+"\n"+lastFirstMiddle()+"\n"+initials()+"\n"+length());
    }
}
