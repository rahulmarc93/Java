package employees;

public class Annual_Salary_Calculator {
    public static void main(String[] args) {
        Emp employee = new Emp(1, "Rahulkumar Saha", 15.22);

        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee ID: " + employee.id);
        System.out.println("Monthly Salary: " + employee.salary);
        System.out.println("Annual Salary: " + annualSalary);
    }
}

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends User {
    double salary;

    public Emp(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary*12;
    }
}