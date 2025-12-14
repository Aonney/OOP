import java.util.Scanner;

// ================= User Class =================
class User2 {
    // Instance attributes
    private String username;
    private String password;

    // Static attribute (shared security policy)
    private static int minPasswordLength = 8;

    // Static Setter
    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    // Static Getter
    public static int getMinLength() {
        return minPasswordLength;
    }

    // Constructor
    public User2(String username, String password) {
        this.username = username;
        if (password.length() >= minPasswordLength) {
            this.password = password;
            System.out.println("Creation successful.");
        } else {
            this.password = "invalid";
            System.out.println("Creation failed.");
        }
    }

    // Instance Setter
    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful.");
        } else {
            System.out.println("Update failed.");
        }
    }

    // Instance Getter
    public String getPassword() {
        return password;
    }
}

// ================= Main =================
public class Lab03_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minLength1 = sc.nextInt();
        sc.nextLine();

        String user1_name = sc.nextLine();
        String user1_pass = sc.nextLine();

        String user2_name = sc.nextLine();
        String user2_pass = sc.nextLine();

        int minLength2 = sc.nextInt();
        sc.nextLine();

        String user2_newPass = sc.nextLine();

        // Step 1
        User2.setMinLength(minLength1);

        // Step 2
        User2 user1 = new User2(user1_name, user1_pass);

        // Step 3
        User2 user2 = new User2(user2_name, user2_pass);

        // Step 4
        User2.setMinLength(minLength2);

        // Step 5
        user2.setPassword(user2_newPass);

        // Final Output
        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());
    }
}
