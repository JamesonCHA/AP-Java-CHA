package unit1.lesson3;

public class CirclePropertiesWithVars
{
    public static void main(String[] args)
    {
        // Suppose we want to find the properties of a circle, given a radius.
        double radius = 7.5;
        double pi = 3.14;

        // We can use expressions to get the values of the circumference, area, and diameter of a circle, and store them as variables.
        double diameter = radius * 2;             // d = 2r
        double circumference = 2 * pi * radius;   // c = 2πr
        double area = pi * (radius * radius);     // a = πr^2; using parenthesis to visually separate the values

        System.out.println("A circle of radius " + radius + " will have:");
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
