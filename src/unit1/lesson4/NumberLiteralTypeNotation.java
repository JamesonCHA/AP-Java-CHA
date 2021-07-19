package unit1.lesson4;

public class NumberLiteralTypeNotation {
    public static void main(String[] args) {
        System.out.println(50 / 28); // => 1
        System.out.println((double)50 / 28); // => 1.7857142857142858
        // ^ Recall that Java will use regular division.if either number in a division operation is a decimal-like value.

        // Use this number literal notation to indicate the type a number specifically is,
        // which can make code more readable as we don't need to cast every literal to a type.
        System.out.println(50d / 28); // => 1.7857142857142858
        System.out.println(50 / 28d); // => 1.7857142857142858
    }
}
