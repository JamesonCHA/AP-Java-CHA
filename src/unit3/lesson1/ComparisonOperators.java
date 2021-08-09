package unit3.lesson1;

import java.util.Scanner;

public class ComparisonOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter another number: ");
        double num2 = scanner.nextDouble();

        if(num1 > num2) { // <- comparison operators transform the expression into a boolean.
            System.out.println("The first number is greater.");
        } else if (num1 < num2) {
            System.out.println("The second number is greater.");
        } else {
            System.out.println("Both numbers are equal!");
        }

        if (num1 == 42) { // <- equality operator
            System.out.println("Also, the first number is the answer to the universe!");
        }

        if (num2 == 42) {
            System.out.println("Also, the second number is the answer to the universe!");
        }
    }
}
