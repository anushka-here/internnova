package week1;

public class t5 {
    public static void main(String[] args) {

        int num = 100;
        double implicitValue = num;

        System.out.println("Implicit Type Casting");
        System.out.println("Before Casting (int): " + num);
        System.out.println("After Casting (double): " + implicitValue);

        double price = 99.99;
        int explicitValue = (int) price;

        System.out.println("\nExplicit Type Casting");
        System.out.println("Before Casting (double): " + price);
        System.out.println("After Casting (int): " + explicitValue);
    }
}