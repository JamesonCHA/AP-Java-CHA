package unit3.lesson1;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double myDecimal = scanner.nextDouble();

        if(myDecimal > 0) {
            System.out.println("It is positive!");
        } else if (myDecimal < 0) {
            System.out.println("It is negative!");
        } else {
            System.out.println("It is zero!");
        }
    }
}
