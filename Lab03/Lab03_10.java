import java.util.Scanner;

// ================= SystemLogger =================
class SystemLogger {

    // Static attribute
    private static int currentLogLevel = 1; // 1 = INFO

    // Private helper method
    private static String getLevelName(int level) {
        switch (level) {
            case 1: return "INFO";
            case 2: return "DEBUG";
            case 3: return "ERROR";
            default: return "UNKNOWN";
        }
    }

    // Public static setter
    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    // Main logging method
    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            String levelName = getLevelName(messageLevel);
            System.out.println("[" + levelName + "]: " + message);
        }
    }
}

// ================= Main =================
public class Lab03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < N; i++) {
            String command = sc.next();

            if (command.equals("SET")) {
                int level = sc.nextInt();
                SystemLogger.setLogLevel(level);

            } else if (command.equals("LOG")) {
                int msgLevel = sc.nextInt();
                sc.nextLine(); // clear buffer
                String message = sc.nextLine();
                SystemLogger.log(msgLevel, message);
            }
        }
    }
}
