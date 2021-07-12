package unit1.lesson2;

public class AddVsConcat {
    public static void main(String[] args) {
        System.out.println(1 + 2 + 3);
        System.out.println("hi" + 2 + 3);
        System.out.println(1 + "hi" + 3);
        System.out.println(1 + 2 + "hi");
        System.out.println(1 + 2 + "hi" + 4 + 5);
    }
}
