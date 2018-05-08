package Exercise4;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        System.out.println("Welcome to the virtual grocery!");
        ShoppingCart cart = new ShoppingCart();
        while(true) {
            String name;
            int amount;
            double price;
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the item name you would like to purchase, or enter done.");
            String temp = scan.next();
            if(temp.equalsIgnoreCase("done")) {
                System.out.println("Please pay " + cart.total());
                System.exit(0);
            }
            else {
                name = temp;
                System.out.println("Please enter the price:");
                price = scan.nextDouble();
                System.out.println("How many did you purchase?");
                amount = scan.nextInt();
                cart.addToCart(name, price, amount);
                System.out.println(cart.toString());
            }

        }
    }
}
