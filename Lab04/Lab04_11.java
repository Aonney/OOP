import java.util.Scanner;

/* -------------------- Configuration Class (Immutable) -------------------- */
class Configuration {

    // Attributes (immutable)
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    // Constructor หลัก
    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;

        // Validation: fontSize ต้องอยู่ระหว่าง 10 - 20
        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }

        this.darkMode = darkMode;
    }

    // Merge Constructor (รวม Base + User)
    public Configuration(Configuration base, Configuration user) {
        // ใช้ค่า:
        // theme -> user
        // darkMode -> user
        // fontSize -> base
        this(user.theme, base.fontSize, user.darkMode);
    }

    // แสดงการตั้งค่า
    public void displaySettings() {
        System.out.println(
            "Theme: " + theme +
            ", Size: " + fontSize +
            ", Dark: " + darkMode
        );
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Base Configuration
        String baseTheme = sc.nextLine();
        int baseFontSize = sc.nextInt();
        boolean baseDarkMode = sc.nextBoolean();
        sc.nextLine(); // เคลียร์ buffer

        // User Configuration
        String userTheme = sc.nextLine();
        int userFontSize = sc.nextInt();   // รับมาเพื่อสร้าง userConfig
        boolean userDarkMode = sc.nextBoolean();

        // สร้าง Base และ User Config
        Configuration baseConfig =
                new Configuration(baseTheme, baseFontSize, baseDarkMode);

        Configuration userConfig =
                new Configuration(userTheme, userFontSize, userDarkMode);

        // สร้าง Final Config ด้วย Merge Constructor
        Configuration finalConfig =
                new Configuration(baseConfig, userConfig);

        // แสดงผล
        finalConfig.displaySettings();
    }
}
