package Exercise4;

// ***************************************************************
// ShoppingCart.java
//
// Represents a shopping cart as an array of items
// *************************************************************** import

import java.text.NumberFormat;
import java.util.Arrays;

public class ShoppingCart {
    private int itemCount; // total number of items in the cart
    private double totalPrice; // total price of items in the cart
    private Item[] cart = new Item[5];
    private int iter = 0;
    // ---------------------------------------------------------
// Creates an empty shopping cart with a capacity of 5 items.
// ---------------------------------------------------------
    public ShoppingCart() {
        itemCount = 0;
        totalPrice = 0.0;
    }

    // -----------------------------------------------------
// Adds an item to the shopping cart.
// -----------------------------------------------------
    public void addToCart(String itemName, double price, int quantity) {
        cart[iter] = new Item(itemName, price, quantity);
        iter++;
        totalPrice += price*quantity;
        itemCount++;
    }

    // -----------------------------------------------------
// Returns the contents of the cart together with
// summary information.
// -----------------------------------------------------
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem Price  Quantity  Total\n";
        for (int i = 0; i < itemCount; i++) {
            contents += cart[i].toString() + "\n";
        }
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        return contents;
    }
        // -----------------------------------------------------
// Increases the capacity of the shopping cart by 3
// -----------------------------------------------------
        private void increaseSize()
        {
            for (int i = 0; i < cart.length; i++) {
                cart = Arrays.copyOf(cart, i + 3);
            }
        }

        public double total() {
            return totalPrice;
        }
}
