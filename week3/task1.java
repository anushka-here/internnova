package week3;

public class task1 {
    String studentName;
    int rollNumber;
    String branch;
    double cgpa;

    void displayStudent() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Branch : " + branch);
        System.out.println("CGPA : " + cgpa);
        System.out.println("----------------------------");
    }
}

class Student {
    String studentName;
    int rollNumber;
    String branch;
    double cgpa;

    void displayStudent() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Branch : " + branch);
        System.out.println("CGPA : " + cgpa);
        System.out.println("----------------------------");
    }
}

class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentName = "Anushka";
        s1.rollNumber = 101;
        s1.branch = "CSE";
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.studentName = "Rahul";
        s2.rollNumber = 102;
        s2.branch = "CSE";
        s2.cgpa = 8.2;

        Student s3 = new Student();
        s3.studentName = "Priya";
        s3.rollNumber = 103;
        s3.branch = "IT";
        s3.cgpa = 9.0;

        System.out.println("===== STUDENT INFORMATION =====");

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();
    }
}
