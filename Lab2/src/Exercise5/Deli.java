package Exercise5; // The file is located in package Exercise5

// ************************************************************
// DeliFormat.java
//
// Computes the price of a deli item given the weight
// (in ounces) and price per pound -- prints a label,
// nicely formatted, for the item.
//
// Contributors: Ricky Sethi, Peter Lillie, Kyle White
//
// ************************************************************

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Deli
{
    // ---------------------------------------------------
    // main reads in the price per pound of a deli item
    // and number of ounces of a deli item then computes
    // the total price and prints a "label" for the item
    // ---------------------------------------------------
    public static void main (String[] args)
    {
        final double OUNCES_PER_POUND = 16.0;
        // Price per pound, weight in ounces, weight in pound, computed total price
        double pricePerPound, weightOunces, weight, totalPrice;
        Scanner scan = new Scanner(System.in); // Initialize a scanner

        // Declare money as a NumberFormat object and use the
        // getCurrencyInstance method to assign it a value
        NumberFormat money = NumberFormat.getCurrencyInstance();
        // Here's how NumberFormat works, essentially it uses a method, (in this case getCurrencyInstance()
        // and uses the arguments contained in the method to format the item 'i' that gets passed to it.
        // money.format(i) Notice that no arguments were passed into the method, this is because USD is
        // the default formatting.

        // Declare fmt as a DecimalFormat object and instantiate
        // it to format numbers with at least one digit to the left of the
        // decimal and the fractional part rounded to two digits.
        // prompt the user and read in each input
        DecimalFormat fmt = new DecimalFormat("0.00");
        // Here's how DecimalFormat works, you create a new format object: DecimalFormat()
        // Then you just show it how you want it to be formatted. In this case we wanted it to be a string
        // "" and we wanted at least one digit on the right of the decimal 0. and at least two on the left ".00"

        System. out. println ("Welcome to the CS Deli!!! \n ");
        System.out.print("Enter the price per pound of your item: "); // Prompting
        pricePerPound = scan.nextDouble(); // The user cannot enter anything except for an int or double
        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        // Convert ounces to pounds and compute the total price
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;

        // Print the label using the formatting objects
        // fmt for the weight in pounds and money for the prices
        System.out.println("*****CSDeli*****");
        System.out.println("\nUnit Price: " + money.format(pricePerPound)); // Use the money format "default"
        System.out.println("Weight: " + fmt.format(weight)); // Use the decimal format "0.00"
        System.out.println("\nTotal: " + money.format(totalPrice));
    }
}