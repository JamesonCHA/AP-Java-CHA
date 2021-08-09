package unit3.lesson1;

import java.util.Scanner;

public class ShortCircuiting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean thisIsTrue = true;

        System.out.print("What should the first boolean be (t/f)? ");
        boolean myBool = scanner.nextLine().equalsIgnoreCase("t");

        if(myBool && thisIsTrue) {
            System.out.println("Both values are true.");
        } else {
            System.out.println("Since the `&&` operator is used and `myBool` is false, Java doesn't evaluate the next value because it's unnecessary.");
        }
    }
}
