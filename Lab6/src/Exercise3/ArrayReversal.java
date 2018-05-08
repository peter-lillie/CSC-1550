package Exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {
    public static void main(String[] args) {
        System.out.println("Please enter the amount of numbers you want to store: ");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        System.out.println("Enter the values you want to store: ");
        for(int i=0; i<array.length; i++) {
            array[i] = scan.nextInt();
        }
        for(int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1 ] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
