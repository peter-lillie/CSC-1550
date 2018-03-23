package Exercise2;

// ************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
//
// Contributors: Peter Lillie, Kyle White, and Ricky Sethi
//
// ************************************************************

import java.util.Scanner;

public class Student
{
    //declare instance data
    String name;
    Scanner scan = new Scanner(System.in);
    double test1, test2;
    boolean condition=true;
// ---------------------------------------------
//constructor
// ---------------------------------------------
    public Student(String studentName)
    {
//add body of constructor
        name = studentName;
    }
    // ---------------------------------------------
//inputGrades: prompt for and read in student's grades for test1 and test2.
//Use name in prompts, e.g., "Enter's Joe's score for test1".
// ---------------------------------------------
    public void inputGrades() {
//add body of inputGrades
        while (condition) {
            try {
                System.out.println("Please enter the grades for " + name + "'s tests, separated by spaces.");
                test1 += scan.nextDouble();
                test2 += scan.nextDouble();
                condition = false;
            } catch(Exception e) {
                System.out.println("You must have put something in wrong.");
                scan.nextLine();
            }
        }
    }
    // ---------------------------------------------
//getAverage: compute and return the student's test average
// ---------------------------------------------
//add header for getAverage
    public String getAverage()
    {
//add body of getAverage
        double average = (test1+test2)/2;
        return(name + "'s average is: " + average);
    }
    // ---------------------------------------------
//getName: print the student's name
// ---------------------------------------------
//add header for printName
    public String printName()
    {
//add body of printName
        return("Name: " + name + " Test1: " + test1 + " Test2: " + test2);
    }
}

