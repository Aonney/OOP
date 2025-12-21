import java.util.Scanner;

/* -------------------- Product Class -------------------- */
class Product {

    // Attributes
    private String name;
    private double price;

    // Constructor ที่ 1 : รับเฉพาะชื่อสินค้า
    // ใช้ Constructor Chaining เรียกตัวที่ 2
    public Product(String name) {
        this(name, 0.0); // เรียก constructor หลัก
    }

    // Constructor ที่ 2 : Constructor หลัก
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method แสดงข้อมูลสินค้า
    public void displayInfo() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

/* -------------------- Main Class -------------------- */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าโหมด
        int mode = sc.nextInt();
        sc.nextLine(); // เคลียร์ buffer

        Product product;

        if (mode == 1) {
            // โหมด 1 : รับเฉพาะชื่อสินค้า
            String name = sc.nextLine();
            product = new Product(name); // ใช้ constructor ตัวที่ 1

        } else if (mode == 2) {
            // โหมด 2 : รับชื่อสินค้าและราคา
            String name = sc.nextLine();
            double price = sc.nextDouble();
            product = new Product(name, price); // ใช้ constructor ตัวที่ 2

        } else {
            System.out.println("Invalid mode");
            return;
        }

        // แสดงข้อมูลสินค้า
        product.displayInfo();
    }
}
