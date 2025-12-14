import java.util.Scanner;

// ================= Employee =================
class Employee1 {

    // Instance attributes
    private String name;
    private double monthlySalary; // confidential data

    // Constructor
    public Employee1(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    // Public getter
    public String getName() {
        return name;
    }

    // Give raise with validation
    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Private helper: annual salary
    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    // Public method to calculate tax
    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

// ================= Main =================
public class Lab03_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String name = sc.nextLine();
        double monthlySalary = sc.nextDouble();
        double taxRate = sc.nextDouble();
        double raiseAmount = sc.nextDouble();

        // Create employee
        Employee1 emp = new Employee1(name, monthlySalary);

        // Tax before raise
        double taxBefore = emp.calculateTax(taxRate);
        System.out.println("Tax (Before): " + taxBefore);

        // Give raise
        emp.giveRaise(raiseAmount);

        // Tax after raise
        double taxAfter = emp.calculateTax(taxRate);
        System.out.println("Tax (After): " + taxAfter);
    }
}
