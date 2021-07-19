package unit1.lesson4;

public class RoundingDecimals {
    public static void main(String[] args) {
        double exactlyPoint5 = 5.5;
        int roundedFromPoint5 = (int)(exactlyPoint5 + .5); // 5.5 + .5 == 6.0; casting makes it become 6
        System.out.println(roundedFromPoint5);

        double lessThanPoint5 = 5.4;
        int roundedFromLessThanPoint5 = (int)(lessThanPoint5 + .5); // 5.4 + .5 == 5.9; casting makes it become 5
        System.out.println(roundedFromLessThanPoint5);

        double moreThanPoint5 = 5.6;
        int roundedFromMoreThanPoint5 = (int)(moreThanPoint5 + .5); // 5.6 + .5 == 6.1; casting makes it become 6
        System.out.println(roundedFromMoreThanPoint5);
    }
}
