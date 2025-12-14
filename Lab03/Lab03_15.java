import java.util.Scanner;

// ================= User =================
class User4 {

    // Instance attributes
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    // Static policy
    private static int maxAttempts = 3;

    // Constructor
    public User4(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    // Static setter for policy
    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    // Login method
    public void login(String password) {

        // Condition 1: already locked
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        // Condition 2: correct password
        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
        }
        // Condition 3: wrong password
        else {
            failedAttempts++;

            if (failedAttempts >= maxAttempts) {
                isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                int remaining = maxAttempts - failedAttempts;
                System.out.println(
                    "Login failed. " + remaining + " attempts left."
                );
            }
        }
    }
}

// ================= Main =================
public class Lab03_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create user
        String username = sc.nextLine();
        User4 user = new User4(username);

        // Number of commands
        int N = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();

            if (command.equals("SET_POLICY")) {
                int max = sc.nextInt();
                sc.nextLine();
                User4.setPolicy(max);

            } else if (command.equals("LOGIN")) {
                String password = sc.nextLine();
                user.login(password);
            }
        }
    }
}
