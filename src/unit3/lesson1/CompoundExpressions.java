package unit3.lesson1;

import java.util.Scanner;

public class CompoundExpressions {
    public static void main(String[] args) {
        // NOT `!` operator: inverts a boolean expression to give the opposite result
        // AND `&&` operator: only becomes true if BOTH of the expressions next to it are true
        // OR `||` operator: becomes true if EITHER of the two expressions next to it are true

        Scanner scanner = new Scanner(System.in);

        System.out.print("Is it sunny (y/n)? ");
        boolean isSunny = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Enter the temperature (F): ");
        double tempInFahrenheit = scanner.nextDouble();

        if(tempInFahrenheit < 0) {
            System.out.println("It's freezing! Stay inside or risk frostbite!");
        } else if (0 <= tempInFahrenheit && tempInFahrenheit < 32) {
            System.out.println("It's cold, but enough to have fun in the snow.");
        } else if (32 <= tempInFahrenheit && tempInFahrenheit < 60) {
            System.out.println("It's a bit chilly. Bring a sweater.");
        } else if (tempInFahrenheit >= 60) {
            System.out.println("It's fair weather today.");
        } else if (isSunny && tempInFahrenheit >= 80 || tempInFahrenheit >= 90) {
            System.out.println("It's blistering hot! Bring some water!");
        }
    }

}
