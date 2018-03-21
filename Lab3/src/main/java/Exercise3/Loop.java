package Exercise3;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int sum = 0, count = 0, samp = 4; //setup
        Scanner scan = new Scanner(System.in);
        String keepGoing = "y";
        int nextVal;
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter the next integer: "); //do work
            nextVal = scan.nextInt();
            sum = sum + nextVal;
            count++;
            System.out.println("Type y or Y to keep going"); //update condition
            keepGoing = scan.next();
        }
        System.out.println("The sum of your integers is " + sum + " and you added " + count + " integers.");
        count = 10;
        while (count > 0) {
            System.out.println(count);
            count -= 1;
        }
        count = 0;
        for (int i=1; i <= samp; i++) {
            count += i;
        }
        System.out.println("You printed this " + count + " times!");

    }
}
