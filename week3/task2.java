package week3;

public class task2 {
    
    static class Employee {
    int employeeId;
    String employeeName;
    String department;
    double salary;

    // Default constructor
    Employee() {
        employeeId = 0;
        employeeName = "Unknown";
        department = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized constructor
    Employee(int employeeId, String employeeName, String department, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println("----------------------------");
    }
}

public static class EmployeeInformation {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee(
                102,
                "Rahul",
                "Development",
                50000
        );

        System.out.println("===== EMPLOYEE INFORMATION =====");

        System.out.println("Employee created using Default Constructor:");
        e1.displayEmployee();

        System.out.println("Employee created using Parameterized Constructor:");
        e2.displayEmployee();
    }
}
}
