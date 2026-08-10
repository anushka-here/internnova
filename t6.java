import java.util.Scanner;

public class t6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a float: ");
        float floatValue = sc.nextFloat();

        System.out.print("Enter a double: ");
        double doubleValue = sc.nextDouble();

        System.out.println("\nEntered Values");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);

        double implicitCast = intValue;

        int explicitFromDouble = (int) doubleValue;
        int explicitFromFloat = (int) floatValue;

        System.out.println("\nType Casting Results");
        System.out.println("Implicit Casting (int to double): " + implicitCast);

        System.out.println("Explicit Casting (double to int)");
        System.out.println("Before: " + doubleValue);
        System.out.println("After: " + explicitFromDouble);

        System.out.println("Explicit Casting (float to int)");
        System.out.println("Before: " + floatValue);
        System.out.println("After: " + explicitFromFloat);

        sc.close();
    }
}