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

class TeamLead extends Manager {
    int teamSize;

    void displayTeamLead() {
        System.out.println("Team Size: " + teamSize);
    }
}

public class MultilevelInheritence {
    public static void main(String[] args) {
        TeamLead tl = new TeamLead();
        tl.name = "Karim";
        tl.salary = 60000;
        tl.department = "IT";
        tl.teamSize = 5;

        tl.displayEmployee();
        tl.displayManager();
        tl.displayTeamLead();
    }
}