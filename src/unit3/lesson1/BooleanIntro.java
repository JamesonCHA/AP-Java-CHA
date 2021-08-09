package unit3.lesson1;

public class BooleanIntro {
    public static void main(String[] args) {
        boolean myBool = true; // <- can only be `true` or `false`

        if(true) { // <- if statements test booleans
            System.out.println("I always run!");
        }

        if(myBool) { // <- if true, this will run; otherwise, nothing happens.
            System.out.println("myBool is true!");
        }
    }
}
