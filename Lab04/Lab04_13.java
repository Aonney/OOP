import java.util.Scanner;

/* -------------------- Subscription Class -------------------- */
class Subscription {

    // Immutable Instance Attributes
    private final String planName;
    private final int durationDays;

    // Static Policy
    private static int maxDuration = 365;

    // Main Constructor
    public Subscription(String planName, int durationDays) {
        this.planName = planName;

        if (durationDays < 0) {
            this.durationDays = 0;
        } else {
            this.durationDays = durationDays;
        }
    }

    // Copy Constructor
    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    // Static Setter
    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + maxDuration);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    // Immutable Extension
    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, this.durationDays + days);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Policy
        int max = sc.nextInt();
        Subscription.setMaxDuration(max);

        sc.nextLine(); // clear buffer

        // Initial subscription
        String plan = sc.nextLine();
        int initialDays = sc.nextInt();

        Subscription sub = new Subscription(plan, initialDays);

        // First extension
        int ext1 = sc.nextInt();
        sub = sub.extend(ext1);

        // Second extension
        int ext2 = sc.nextInt();
        sub = sub.extend(ext2);

        // Final result
        sub.displayInfo();
    }
}
