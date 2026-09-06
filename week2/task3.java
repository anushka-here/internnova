package week2;

import java.util.Scanner;

public class task3 {

    static double addition(double a, double b) {
        return a + b;
    }

    static double subtraction(double a, double b) {
        return a - b;
    }

    static double multiplication(double a, double b) {
        return a * b;
    }

    static double division(double a, double b) {
        return a / b;
    }

    static double modulus(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\n--- Calculator Results ---");
        System.out.println("Addition: " + addition(num1, num2));
        System.out.println("Subtraction: " + subtraction(num1, num2));
        System.out.println("Multiplication: " + multiplication(num1, num2));

        if (num2 != 0) {
            System.out.println("Division: " + division(num1, num2));
            System.out.println("Modulus: " + modulus(num1, num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
            System.out.println("Modulus: Cannot divide by zero");
        }

        sc.close();
    }
}
