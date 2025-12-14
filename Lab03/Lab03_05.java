import java.util.Scanner;

// ================== DatabaseConnection.java ==================
class DatabaseConnection {
    // Attributes แบบ private
    private String connectionString;
    private boolean connected;

    // Constructor
    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString;
        this.connected = false; // เริ่มต้นยังไม่เชื่อมต่อ
    }

    // ตรวจสอบสถานะการเชื่อมต่อ
    public boolean isConnected() {
        return connected;
    }

    // เชื่อมต่อฐานข้อมูล
    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    // ตัดการเชื่อมต่อฐานข้อมูล
    public void disconnect() {
        if (connected) {
            connected = false;
            System.out.println("Disconnected.");
        } else {
            System.out.println("Already disconnected.");
        }
    }
}

// ================== Main ==================
public class Lab03_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับ connectionString
        String connectionString = sc.nextLine();

        // สร้างออบเจ็กต์ DatabaseConnection
        DatabaseConnection db = new DatabaseConnection(connectionString);

        // เรียกใช้เมธอดตามลำดับที่โจทย์กำหนด
        db.connect();
        db.disconnect();
        db.disconnect(); // เรียกซ้ำเพื่อทดสอบ

        // แสดงสถานะล่าสุด
        System.out.println(db.isConnected());
    }
}
