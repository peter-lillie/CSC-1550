package ExpandedExercises; // The file is located in package ExpandedExercises

/**
 * Improved_Deli.java
 *
 * A new deli using classes to create a better label, with predefined classes
 *
 * Contributor: Peter Lillie
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Improved_Deli
{
    // ---------------------------------------------------
    // main reads in the price per pound of a deli item
    // and number of ounces of a deli item then computes
    // the total price and prints a "label" for the item
    // ---------------------------------------------------



    public static void main (String[] args)
    {

        // Formatters
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MMM dd yy");
        DecimalFormat fmt = new DecimalFormat("0.00");
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // Initialize variables and objects
        ArrayList menu = new ArrayList();
        String[][] order = new String[100][100];
        final String DATE = LocalDateTime.now().format(formatDate);
        final String SELL_DATE = LocalDateTime.now().plusDays(2).format(formatDate);
        String selection, tName, name;
        Deli_Meat sel_object = null;
        final double OUNCES_PER_POUND = 16.0;
        double pricePerPound, weightOunces=0.0, weight, totalPrice, orderTotal = 0.0, tPrice; // Initialize the doubles
        int c1 = 1, c2 = 1, it = 0; // Control variable for the while loop
        Scanner scan = new Scanner(System.in); // Initialize a scanner
        Improved_Deli main = new Improved_Deli();

        Deli_Meat roast_beef = new Deli_Meat("Roast Beef", 14.69);
        menu.add(roast_beef.getName() + " " + roast_beef.getPrice());
        Deli_Meat salami = new Deli_Meat("Salami", 6.79);
        menu.add(salami.getName() + " " + salami.getPrice());
        Deli_Meat american = new Deli_Meat("American Cheese",6.99);
        menu.add(american.getName() + " " + american.getPrice());
        Deli_Meat provolone = new Deli_Meat("Provolone", 7.49);
        menu.add(provolone.getName() + " " + provolone.getPrice());
        Deli_Meat cheddar = new Deli_Meat("Cheddar",7.99);
        menu.add(cheddar.getName() + " " + cheddar.getPrice());
        Deli_Meat bologna = new Deli_Meat("Bologna",9.49);
        menu.add(bologna.getName() + " " + bologna.getPrice());
        Deli_Meat turkey = new Deli_Meat("Turkey",9.49);
        menu.add(turkey.getName() + " " + turkey.getPrice());
        Deli_Meat ham = new Deli_Meat("Honey Ham", 8.29);
        menu.add(ham.getName() + " " + ham.getPrice());

        System.out.println("Welcome to the CS Deli!!!\n");

        while (c1 == 1) {
            System.out.println("Please take a look at our selection!");
            for(Object e : menu) {
                if((menu.indexOf(e) + 1) % 2 == 0 ) {
                    System.out.println(" " + "|" + " " + e);
                }
                else {
                    System.out.print(e);
                }
            }

            System.out.println("\nIf you would like to order one of these items, please enter it's name in the prompt.");
            System.out.println("If you want to enter a new item, enter 'new' in the prompt");
            System.out.print("Item: "); selection = scan.next().toLowerCase().replace(" ","");
            System.out.println(selection);

            switch (selection) {
                case "americancheese": case "american":
                    sel_object = american;
                    break;
                case "roastbeef": case "beef": case "roast":
                    sel_object = roast_beef;
                    break;
                case "bologna": case "bolona":
                    sel_object = bologna;
                    break;
                case "salami": case "salama":
                    sel_object = salami;
                    break;
                case "cheddarcheese": case "cheddar": case "chedder": case "cheddercheese":
                    sel_object = cheddar;
                    break;
                case "provolone": case "provelone": case "provalone":
                    sel_object = provolone;
                    break;
                case "honeyham": case "honey": case "ham":
                    sel_object = ham;
                    break;
                case "turkey": case "white turkey":
                    sel_object = turkey;
                    break;
                case "new": case "newitem":
                    System.out.println("Okay, what is the item's name?");
                    System.out.println("Item Name: "); tName = scan.nextLine();
                    System.out.println("Cool, what is the price per pound?");
                    System.out.println("Item Price: "); tPrice = scan.nextDouble();
                    System.out.println("Cool I will add " + tName + " at " + money.format(tPrice));
                    Deli_Meat custom = new Deli_Meat(tName, tPrice);
                    menu.add(custom);
                    sel_object = custom;
                    break;
                default:
                    System.out.println("Sorry, did not get that!");
                    break;
            }

            if(menu.contains(sel_object.getName() + " " + sel_object.getPrice())) {
                System.out.println("What is the weight of " + sel_object.getName() + "?");
                System.out.print(sel_object.getName() + " Weight (ounces): ");
                try {
                    weightOunces=scan.nextDouble();
                }
                catch(Exception e) {
                    System.out.println("Sorry! I don't think that was a double. :(");
                    continue;
                }
                weight = weightOunces/OUNCES_PER_POUND;
                totalPrice = sel_object.totalPrice(weight);
                System.out.println("Excellent " + sel_object.getName() + " has been added to the order!");
                name = sel_object.getName(); double price = sel_object.getPrice();
                String[] response = main.labelmaker(name, totalPrice, weight, price, DATE, SELL_DATE);
                for (String e : response) {
                    System.out.println(e);
                }

                orderTotal += totalPrice;
                order[it] = response;
                it += 1;

            }
            else {
                System.out.println("Sorry, I still do not have that item. What is it called?");
                System.out.print("Name: ");tName = scan.nextLine();
                System.out.println("Cool so some " + tName);
                System.out.println("And how much does it weight?");
                System.out.print(tName + " Weight: ");
                try {
                    weightOunces = scan.nextDouble();
                }
                catch(Exception e) {
                    System.out.println("Sorry! I don't think that was a double. :(");
                    continue;
                }
                weight = weightOunces/OUNCES_PER_POUND;
                System.out.println("Okay, and how much does it cost?");
                System.out.print(tName + " Price: ");pricePerPound = scan.nextDouble();
                totalPrice = pricePerPound*weight;
                System.out.println("\nOkay, added " + tName + " to the order.");
                name = sel_object.getName(); double price = sel_object.getPrice();
                String[] response = main.labelmaker(name, totalPrice, weight, price, DATE, SELL_DATE);
                for (String e : response) {
                    System.out.println(e);
                }

                orderTotal += totalPrice;
                order[it] = response;
                it += 1;

            }

            while(c2 == 1) {
                System.out.println("A: add another item, O: see your order, Q: quit");
                selection = scan.next().toLowerCase().replace(" ", "");
                switch (selection) {
                    case "a": case "another": case "add":
                        c2 = 2;
                        break;
                    case "q": case "quit": case "cancel":
                        c2 = 2;
                        c1 = 2;
                        System.out.println("Okay, your total is " + money.format(orderTotal) + ".");
                        System.out.println("Have a great day! :)");
                        break;
                    case "o": case "orders": case "history":
                        for (String[] o : order) {
                            for (String s : o) {
                                if(s != null) {
                                    System.out.println(s);
                                }
                            }
                        }
                        System.out.println("Order Total: " + money.format(orderTotal));
                        break;
                    default:
                        System.out.println("Sorry, I did not get that... Try again.");
                        break;
                }
            }

            c2 = 1;

        }

    }

    DecimalFormat fmt = new DecimalFormat("0.00");
    NumberFormat money = NumberFormat.getCurrencyInstance();

    public String[] labelmaker(String name, double total, double weight, double price, String DATE, String SELL_DATE) {
        String[] label = new String[10]; {
            label[0] = "==============================";
            label[1] = "        " + name + "              ";
            label[2] = "------------------------------";
            label[3] = "Packed On:           Sell By:";
            label[4] = DATE + "          " + SELL_DATE;
            label[5] = label[2];
            label[6] = "NET WEIGHT: UNIT PRICE: TOTAL:";
            label[7] = label[2];
            label[8] = fmt.format(weight) + "lb       " + money.format(price) + "/lb   " + money.format(total);
            label[9] = label[0];
        }
        return label;

    }

/*        // Declare money as a NumberFormat object with default value, and DecimalFormat with the
        // pattern similar to a deli label.

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

        System.out.println(menu);*/

}

class Deli_Meat
{
    String name;
    double price, total;

    public Deli_Meat(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public double totalPrice(double args)
    {
        total = this.price*args;
        return total;
    }

}
