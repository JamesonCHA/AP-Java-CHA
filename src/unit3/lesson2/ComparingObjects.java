package unit3.lesson2;

import java.util.Scanner;

public class ComparingObjects {
    public static void main(String[] args) {
        // Every object is associated with an "id" of sorts, known as a reference.
        // This id/reference points back to the object whenever we use it.
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        if(scanner1 == scanner2) System.out.println("`scanner1` and `scanner2` are the same objects.");
        else System.out.println("`scanner1` and `scanner2` are different objects.");

        System.out.println("Assigned `scanner1` to `scanner2`.");
        scanner1 = scanner2; // now they have the same "id"; thus, the object referred by both variables is the same.

        if(scanner1 == scanner2) System.out.println("`scanner1` and `scanner2` are the same objects.");
        else System.out.println("`scanner1` and `scanner2` are different objects.");
    }
}
