import java.util.Scanner;

// ================== User.java ==================
class User1 {
    // Attribute แบบ private (Encapsulation)
    private String password;

    // Constructor รับรหัสผ่านเริ่มต้น
    public User1(String initialPassword) {
        this.password = initialPassword;
    }

    // Getter: คืนค่ารหัสผ่านปัจจุบัน
    public String getPassword() {
        return password;
    }

    // Setter: ตั้งรหัสผ่านใหม่ตามกฎ
    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            this.password = newPassword;
            System.out.println("Password updated.");
        } else {
            System.out.println("Password is too short.");
        }
    }
}

// ================== Main ==================
public class Lab03_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับรหัสผ่านเริ่มต้น
        String initialPassword = sc.nextLine();

        // รับรหัสผ่านใหม่
        String newPassword = sc.nextLine();

        // สร้างออบเจ็กต์ User
        User1 user = new User1(initialPassword);

        // พยายามอัปเดตรหัสผ่าน
        user.setPassword(newPassword);

        // แสดงผลรหัสผ่านปัจจุบัน
        System.out.println(user.getPassword());
    }
}
