import java.util.Scanner;

// ---------- Superclass ----------
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getStatus() {
        return "Person: " + name;
    }
}

// ---------- Subclass : Student ----------
class Student extends Person {
    protected int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getStatus() {
        return "Student: " + name + ", ID: " + studentId;
    }
}

// ---------- Subclass : Employee ----------
class Employee2 extends Person {
    protected double salary;

    public Employee2(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public void applyBonus(double bonus) {
        salary += bonus;
    }

    @Override
    public String getStatus() {
        return "Employee: " + name + ", Salary: " + salary;
    }
}

// ---------- Main Class ----------
public class Lab05_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Student
        String studentName = sc.nextLine();
        int studentId = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Input Employee
        String employeeName = sc.nextLine();
        double salary = sc.nextDouble();

        // 1. Create objects
        Student s = new Student(studentName, studentId);
        Employee2 e = new Employee2(employeeName, salary);

        // 2. Store in Person array
        Person[] people = new Person[2];
        people[0] = s;
        people[1] = e;

        // 3. Downcasting with instanceof
        for (Person p : people) {
            if (p instanceof Employee2) {
                Employee2 emp = (Employee2) p; // Downcasting
                emp.applyBonus(1000.0);
            }
        }

        // 4. Display status
        for (Person p : people) {
            System.out.println(p.getStatus());
        }

        sc.close();
    }
}
