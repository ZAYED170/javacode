// Parent class
class Employee {
    String name;
    int salary;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

// Child class
class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

public class SingleInheritence {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Rahim";
        m.salary = 50000;
        m.department = "Sales";

        m.displayEmployee(); // Employee class method
        m.displayManager();  // Manager class method
    }
}