package week3;

public class task4 {
    
    static class Employee {
    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name        : " + name);
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Salary      : " + salary);
    }
}

// Child class
static class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int employeeId, double salary,
              String programmingLanguage) {

        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Programming Language : "
                + programmingLanguage);
        System.out.println("----------------------------");
    }
}

// Child class
static class Manager extends Employee {

    int teamSize;

    Manager(String name, int employeeId, double salary,
            int teamSize) {

        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Team Size : " + teamSize);
        System.out.println("----------------------------");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Developer d = new Developer(
                "Anushka",
                101,
                60000,
                "Java"
        );

        Manager m = new Manager(
                "Rahul",
                102,
                80000,
                10
        );

        System.out.println("===== EMPLOYEE DETAILS =====");

        System.out.println("Developer:");
        d.displayDeveloper();

        System.out.println("Manager:");
        m.displayManager();
    }
}
}
