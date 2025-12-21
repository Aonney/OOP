import java.util.Scanner;

/* -------------------- Book Class -------------------- */
class Book {

    // Attributes (ข้อมูลของหนังสือ)
    private String title;
    private String author;

    // Constructor ที่ 1 : รับเฉพาะชื่อเรื่อง
    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    // Constructor ที่ 2 : รับชื่อเรื่องและผู้แต่ง
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method สำหรับแสดงข้อมูลหนังสือ
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าโหมด
        int mode = sc.nextInt();
        sc.nextLine(); // เคลียร์ buffer

        Book book; // ประกาศออบเจ็กต์ Book

        if (mode == 1) {
            // โหมด 1 : รับเฉพาะชื่อเรื่อง
            String title = sc.nextLine();
            book = new Book(title);   // ใช้ Constructor ตัวที่ 1

        } else if (mode == 2) {
            // โหมด 2 : รับชื่อเรื่องและผู้แต่ง
            String title = sc.nextLine();
            String author = sc.nextLine();
            book = new Book(title, author); // ใช้ Constructor ตัวที่ 2

        } else {
            // กรณีโหมดไม่ถูกต้อง
            System.out.println("Invalid mode");
            return;
        }

        // แสดงข้อมูลหนังสือ
        book.displayInfo();
    }
}
