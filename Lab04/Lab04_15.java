import java.util.Scanner;

/* -------------------- AuditRecord Class -------------------- */
class AuditRecord {

    // Immutable Instance Attributes
    private final String user;
    private final String[] logMessages;

    // Static Policy
    private static int maxMessages = 3;

    // Constructor 1 (Chaining)
    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    // Constructor 2 (Main Constructor)
    public AuditRecord(String user, String[] logs) {
        this.user = user;

        // Validation: เก็บเฉพาะ log ล่าสุดตาม policy
        if (logs.length > maxMessages) {
            this.logMessages = new String[maxMessages];
            int start = logs.length - maxMessages;
            for (int i = 0; i < maxMessages; i++) {
                this.logMessages[i] = logs[start + i];
            }
        } else {
            // Deep Copy
            this.logMessages = new String[logs.length];
            for (int i = 0; i < logs.length; i++) {
                this.logMessages[i] = logs[i];
            }
        }
    }

    // Static Setter (Policy)
    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + max);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    // Immutable Action
    public AuditRecord addMessage(String message) {
        if (logMessages.length < maxMessages) {
            String[] newLogs = new String[logMessages.length + 1];
            for (int i = 0; i < logMessages.length; i++) {
                newLogs[i] = logMessages[i];
            }
            newLogs[logMessages.length] = message;

            System.out.println(message + " added.");
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    // Display
    public void displayLog() {
        System.out.print("User: " + user + ", Logs: " + logMessages.length + " [");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
            if (i < logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Set Policy
        int max = sc.nextInt();
        sc.nextLine();
        AuditRecord.setPolicy(max);

        // User
        String user = sc.nextLine();
        AuditRecord record = new AuditRecord(user);

        // Number of logs
        int n = sc.nextInt();
        sc.nextLine();

        // Add logs
        for (int i = 0; i < n; i++) {
            String msg = sc.nextLine();
            record = record.addMessage(msg);
        }

        // Final display
        record.displayLog();
    }
}
