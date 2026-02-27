class Employee {
    String name;
    int salary;

    void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void displayDeveloper() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class HierarchicalInheritence {
    public static void main(String[] args) {
        Manager m = new Manager();
        Developer d = new Developer();

        m.name = "Rahim";
        m.salary = 70000;
        m.department = "Sales";

        d.name = "Karim";
        d.salary = 60000;
        d.programmingLanguage = "Java";

        m.displayEmployee();
        m.displayManager();

        d.displayEmployee();
        d.displayDeveloper();
    }
}