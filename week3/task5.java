package week3;

public class task5 {
    
    // Method Overloading
    static class Calculator {

        int calculate(int a, int b) {
            return a + b;
        }

        double calculate(double a, double b) {
            return a + b;
        }

        int calculate(int a, int b, int c) {
            return a + b + c;
        }
    }

    // Parent class
    static class Vehicle {

        void start() {
            System.out.println("Vehicle is starting");
        }
    }

    // Child class
    static class Car extends Vehicle {

        @Override
        void start() {
            System.out.println("Car starts with a key");
        }
    }

    // Child class
    static class Bike extends Vehicle {

        @Override
        void start() {
            System.out.println("Bike starts with a self-start button");
        }
    }

public class PolymorphismDemo {
    public static void main(String[] args) {

        System.out.println("===== METHOD OVERLOADING =====");

        Calculator c = new Calculator();

        System.out.println("Two integers: "
                + c.calculate(10, 20));

        System.out.println("Two doubles: "
                + c.calculate(10.5, 20.5));

        System.out.println("Three integers: "
                + c.calculate(10, 20, 30));

        System.out.println();

        System.out.println("===== METHOD OVERRIDING =====");

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}
}
