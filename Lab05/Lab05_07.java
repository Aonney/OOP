import java.util.Scanner;

// ---------------- Superclass ----------------
class Employee1 {
    protected String name;
    protected double baseSalary;

    public Employee1(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary; // เงินเดือนพื้นฐาน
    }
}

// ---------------- Subclass : SalesEmployee ----------------
class SalesEmployee extends Employee1 {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary); // เรียก constructor ของคลาสแม่
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

// ---------------- Subclass : Manager ----------------
class Manager1 extends Employee1 {
    protected double fixedBonus;

    public Manager1(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary); // เรียก constructor ของคลาสแม่
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

// ---------------- Utility Class ----------------
class PayrollProcessor {
    public static void process(Employee1 e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

// ---------------- Main Class ----------------
public class Lab05_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input SalesEmployee
        String salesName = sc.nextLine();
        double salesSalary = sc.nextDouble();
        double rate = sc.nextDouble();
        sc.nextLine(); // clear buffer

        // Input Manager
        String managerName = sc.nextLine();
        double managerSalary = sc.nextDouble();
        double bonus = sc.nextDouble();

        // Create objects
        Employee1 sales = new SalesEmployee(salesName, salesSalary, rate);
        Employee1 manager = new Manager1(managerName, managerSalary, bonus);

        // Process payroll
        PayrollProcessor.process(sales);
        PayrollProcessor.process(manager);

        sc.close();
    }
}
