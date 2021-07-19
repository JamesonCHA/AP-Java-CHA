package unit2.lesson1;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //                ^^^ create an object by using the `new` keyword

        System.out.print("Say something: ");
        String userInput = scanner.nextLine(); // or `scanner.next()`
        //                 ^^^^^^^^^^^^^^^^^^ this makes the program wait until an input is entered
        System.out.println("You said: " + userInput);
    }
}
