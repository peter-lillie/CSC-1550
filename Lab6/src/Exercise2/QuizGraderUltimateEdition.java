package Exercise2;

import java.util.Scanner;

public class QuizGraderUltimateEdition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double correct = 0;
        boolean condition = true;

        System.out.println("Please enter the number of questions on the quiz.");
        int key[] = new int[scan.nextInt()];
        System.out.println("Please enter the correct answers for the quiz.");
        for (int i = 0; i < key.length; i++) {
            key[i] = scan.nextInt();
        }
        while (condition) {
            System.out.println("Please enter the student's answers.");
            for (int i = 0; i < key.length; i++) {
                if (Integer.parseInt(scan.next()) == key[i]) {
                    correct++;
                }
            }

            System.out.println("The student got " + Math.round(correct) + " questions correct for " +
                    Math.round(correct / key.length * 100) + "%");
            System.out.println("Grade another quiz? y/n");
            if(scan.next().equalsIgnoreCase("y")) {
                correct=0;
            }
            else {
                condition = false;
                System.exit(0);
            }
        }
    }
}
