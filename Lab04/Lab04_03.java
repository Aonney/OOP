import java.util.Scanner;

/* -------------------- Player Class -------------------- */
class Player {

    // Attributes
    private String username;
    private int level;

    // Constructor ที่ 1 : Default Constructor
    public Player() {
        this.username = "Guest";
        this.level = 1;
    }

    // Constructor ที่ 2 : รับชื่อผู้ใช้และเลเวล
    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    // Method แสดงข้อมูลผู้เล่น
    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าโหมด
        int mode = sc.nextInt();
        sc.nextLine(); // เคลียร์ buffer

        Player player;

        if (mode == 1) {
            // โหมด 1 : ใช้ Default Constructor
            player = new Player();

        } else if (mode == 2) {
            // โหมด 2 : รับชื่อผู้ใช้และเลเวล
            String username = sc.nextLine();
            int level = sc.nextInt();
            player = new Player(username, level);

        } else {
            System.out.println("Invalid mode");
            return;
        }

        // แสดงข้อมูลผู้เล่น
        player.displayProfile();
    }
}
