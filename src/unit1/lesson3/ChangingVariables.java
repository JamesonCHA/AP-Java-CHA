package unit1.lesson3;

public class ChangingVariables {

    public static void main(String[] args) {
        int myInt = 0;
        myInt = myInt + 2; // add 2 to `myInt`
        myInt++; // increment `myInt` by 1
        myInt--; // decrement `myInt` by 1

        String myString = "hello";
        myString += " world!"; // string concatenation is used for the `+=` operator when dealing with strings
        System.out.println(myString); // "hello world!"
    }
}

