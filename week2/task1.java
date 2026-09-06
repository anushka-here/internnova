package week2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int marks2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int marks3 = sc.nextInt();

        int total = marks1 + marks2 + marks3;
        double percentage = total / 3.0;

        String result;

        if (marks1 < 33 || marks2 < 33 || marks3 < 33) {
            result = "Fail";
        } else if (percentage >= 60) {
            result = "First Division";
        } else if (percentage >= 50) {
            result = "Second Division";
        } else if (percentage >= 33) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        System.out.println("\n--- Student Result ---");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);

        sc.close();
    }
}
