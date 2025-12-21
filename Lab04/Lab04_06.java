import java.util.Scanner;

/* -------------------- Point Class (Immutable) -------------------- */
class Point {

    // Attributes (immutable)
    private final int x;
    private final int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // เคลื่อนที่และคืนค่า Point ตัวใหม่
    public Point move(int dx, int dy) {
        int newX = this.x + dx;
        int newY = this.y + dy;
        return new Point(newX, newY);
    }

    // แสดงพิกัด
    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าพิกัดเริ่มต้นและค่าการเคลื่อนที่
        int x = sc.nextInt();
        int y = sc.nextInt();
        int dx = sc.nextInt();
        int dy = sc.nextInt();

        // 1. สร้างพิกัดเริ่มต้น
        Point p1 = new Point(x, y);

        // 2. เคลื่อนที่ครั้งที่ 1
        Point p2 = p1.move(dx, dy);

        // 3. เคลื่อนที่ครั้งที่ 2
        Point p3 = p2.move(dx, dy);

        // 4. แสดงผลลัพธ์
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
    }
}
