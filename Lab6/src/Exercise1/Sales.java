package Exercise1;
// ***************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ***************************************************************
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        int sum;
        int max_sales = 0;
        int min_sales = Integer.MAX_VALUE;
        int max_salesperson = 0;
        int min_salesperson = 0;
        int test_value;
        int exceeded = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of people who you would like to enter sales for: ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
            if(sales[i] > max_sales) {
                max_sales = sales[i];
                max_salesperson = (i+1);
            }
            else if(min_sales > sales[i]) {
                min_sales = sales[i];
                min_salesperson = (i+1);
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sales: " + Math.round(sum/5));
        System.out.println("Salesperson " + max_salesperson + " had the most sales: " + max_sales);
        System.out.println("Salesperson " + min_salesperson + " had the fewest sales: " + min_sales);
        System.out.println("Please enter a value to see how many salespeople exceeded that value.");
        test_value = scan.nextInt();
        System.out.println("The following individuals exceeded your value:");
        for (int i=0; i<sales.length; i++) {
            if(sales[i] > test_value) {
                System.out.println("Salesperson " + (i+1 + " with " + sales[i] + " in sales."));
                exceeded++;
            }
        }
        System.out.println("The total number of salespeople who exceeded your value is: " + exceeded);
    }
}
