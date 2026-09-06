package week2;

import java.util.Scanner;

public class task4 {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter first number for average: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number for average: ");
        double b = sc.nextDouble();

        System.out.print("Enter third number for average: ");
        double c = sc.nextDouble();

        System.out.print("Enter first number for maximum: ");
        int x = sc.nextInt();

        System.out.print("Enter second number for maximum: ");
        int y = sc.nextInt();

        System.out.println("\n--- Results ---");
        System.out.println("Square: " + square(n));
        System.out.println("Cube: " + cube(n));
        System.out.println("Average: " + average(a, b, c));
        System.out.println("Maximum: " + maximum(x, y));

        sc.close();
    }
}