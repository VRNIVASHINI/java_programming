import java.util.*;
interface Employee {
    double calculateSalary();
    void display();
}

class FullTime implements Employee {
    double salary = 30000;

    public double calculateSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Full-Time Employee Salary: " + calculateSalary());
    }
}

class PartTime implements Employee {
    double hourlyRate;
    int hoursWorked;

    PartTime(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    public void display() {
        System.out.println("Part-Time Employee Salary: " + calculateSalary());
    }
}

public class interfaceemployee {
    public static void main(String[] args) {
        FullTime f = new FullTime();
        PartTime p = new PartTime(200, 80);

        f.display();
        p.display();
    }
}