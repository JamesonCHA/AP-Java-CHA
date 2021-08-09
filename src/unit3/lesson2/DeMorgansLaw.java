package unit3.lesson2;

import java.util.Scanner;

public class DeMorgansLaw {
    public static void main(String[] args) {
        // DeMorgan's Law states:
        // !(A & B) = !A | !B    (I)
        // !(A | B) = !A & !B    (II)

        // Note: Treat & as && and | as ||.

        Scanner scanner = new Scanner(System.in);

        System.out.print("What should the first boolean be (t/f)? ");
        boolean bool1 = scanner.nextLine().equalsIgnoreCase("t");
        System.out.print("What should the second boolean be (t/f)? ");
        boolean bool2 = scanner.nextLine().equalsIgnoreCase("t");

        if(!(bool1 && bool2)) {
            System.out.println("- Case I\t\t`!(bool1 && bool2)`\t\ttrue");
        }
        if(!bool1 || !bool2) {
            System.out.println("- Case I\t\t`!bool1 || !bool2`\t\ttrue");
        }

        if(!(bool1 || bool2)) {
            System.out.println("- Case II\t\t`!(bool1 || bool2)`\t\ttrue");
        }
        if(!bool1 && !bool2) {
            System.out.println("- Case II\t\t`!bool1 && !bool2`\t\ttrue");
        }

        if(!(bool1 && bool2) == (!bool1 || !bool2)) System.out.println("`!(bool1 && bool2) == (!bool1 || !bool2)`; DeMorgan's Law is true in case I!");
        else System.out.println("DeMorgan's Law isn't a law thanks to case I being wrong :(");

        if(!(bool1 || bool2) == (!bool1 && !bool2)) System.out.println("`!(bool1 || bool2) == (!bool1 && !bool2)`; DeMorgan's Law is true in case II!");
        else System.out.println("DeMorgan's Law isn't a law thanks to case II being wrong :(");
    }
}
