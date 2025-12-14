import java.util.Scanner;

// ================= LicenseManager =================
class LicenseManager {

    // Private static attributes
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    // Set maximum licenses
    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
        } else if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to " + max);
        }
    }

    // Checkout a license
    public static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout failed: No licenses available.");
            return false;
        }
    }

    // Check-in a license
    public static void checkin() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    // Display current status
    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

// ================= Main =================
public class Lab03_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();

            if (command.equals("SET")) {
                int max = sc.nextInt();
                sc.nextLine(); // clear buffer
                LicenseManager.setMax(max);

            } else if (command.equals("CHECKOUT")) {
                LicenseManager.checkOut();

            } else if (command.equals("CHECKIN")) {
                LicenseManager.checkin();

            } else if (command.equals("STATUS")) {
                LicenseManager.displayStatus();
            }
        }
    }
}
