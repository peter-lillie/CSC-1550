package Exercise4;

import java.util.Scanner;
public class TestNames {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n1f, n1m, n1l, n2f, n2m, n2l;

        System.out.println("Please enter a full name:");
        n1f = scan.next();
        n1m = scan.next();
        n1l = scan.next();
        System.out.println("Please enter another full name:");
        n2f = scan.next();
        n2m = scan.next();
        n2l = scan.next();

        Name name1 = new Name(n1f, n1m, n1l);
        Name name2 = new Name(n2f, n2m, n2l);

        System.out.println(name1.allTheThings());
        System.out.println(name2.allTheThings());
     }
}
