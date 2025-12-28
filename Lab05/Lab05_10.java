import java.util.Scanner;

// ---------- Superclass ----------
class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

// ---------- Subclass : ComplexTask ----------
class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String description, int baseHours, double setupFee) {
        super(description, baseHours);
        this.setupFee = setupFee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

// ---------- Subclass : SimpleTask ----------
class SimpleTask extends ProjectTask {

    public SimpleTask(String description, int baseHours) {
        super(description, baseHours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

// ---------- Main Class ----------
public class Lab05_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ComplexTask
        String complexDesc = sc.nextLine();
        int complexHours = sc.nextInt();
        double setupFee = sc.nextDouble();
        sc.nextLine(); // clear buffer

        // Input SimpleTask
        String simpleDesc = sc.nextLine();
        int simpleHours = sc.nextInt();

        // 1. Create objects
        ComplexTask complex = new ComplexTask(complexDesc, complexHours, setupFee);
        SimpleTask simple = new SimpleTask(simpleDesc, simpleHours);

        // 2. Store in ProjectTask array
        ProjectTask[] tasks = new ProjectTask[2];
        tasks[0] = complex;
        tasks[1] = simple;

        // 3. Calculate and display cost
        for (ProjectTask task : tasks) {
            System.out.println(task.calculateCost());
        }

        sc.close();
    }
}
