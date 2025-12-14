import java.util.Scanner;

// ================= SystemConfig =================
class SystemConfig {

    // Static instance (Singleton)
    private static SystemConfig instance;

    // Instance attributes
    private String serverUrl;
    private int maxConnections;

    // Private constructor
    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    // Public static getter (Singleton access)
    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    // Getter & Setter
    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

// ================= Main =================
public class Lab03_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();

            if (command.equals("SET_URL")) {
                String url = sc.nextLine();
                SystemConfig config = SystemConfig.getInstance();
                config.setServerUrl(url);

            } else if (command.equals("SET_MAX")) {
                int count = sc.nextInt();
                sc.nextLine(); // clear buffer
                SystemConfig config = SystemConfig.getInstance();
                config.setMaxConnections(count);

            } else if (command.equals("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println(config.getServerUrl());
                System.out.println(config.getMaxConnections());
            }
        }
    }
}
