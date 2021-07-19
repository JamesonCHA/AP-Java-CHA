package unit1.lesson4;

public class NumberOverflow {
    public static void main(String[] args) {
        System.out.println("Max integer value: " + Integer.MAX_VALUE); // max integer value (2147483647)
        System.out.println(Integer.MAX_VALUE + 1); // numeric overflow; Java handles this by "wrapping around" to the lowest number permitted in the `int` type
        System.out.println((long)Integer.MAX_VALUE + 1); // you can cast larger ints to the `long` type
        System.out.println((double)Integer.MAX_VALUE + 1); // you can also cast larger numbers to the `double` type

        long bigInt = (long)Integer.MAX_VALUE * 2;
        //                  ^^^^^^^^^^^^^^^^^ Java thinks this is an `int` type, so it needs to be converted to `long` to store bigger numbers.
        System.out.println("Integer.MAX_VALUE * 2 = " + bigInt);
    }
}
