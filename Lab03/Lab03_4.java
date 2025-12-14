import java.util.Scanner;

// ================== Product.java ==================
class Product {
    // Instance attribute
    private String name;

    // Static (class) attribute สำหรับนับจำนวนสินค้า
    private static int productCount = 0;

    // Constructor
    public Product(String name) {
        this.name = name;
        productCount++;   // เพิ่มจำนวนสินค้าทุกครั้งที่สร้างออบเจ็กต์
    }

    // Getter สำหรับชื่อสินค้า
    public String getName() {
        return name;
    }

    // Static getter สำหรับจำนวนสินค้าทั้งหมด
    public static int getProductCount() {
        return productCount;
    }
}

// ================== Main ==================
public class Lab03_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับจำนวนสินค้าที่จะสร้าง
        int N = sc.nextInt();
        sc.nextLine(); // เคลียร์บรรทัดว่าง

        // วนลูปสร้างสินค้า
        for (int i = 0; i < N; i++) {
            String productName = sc.nextLine();
            new Product(productName);
        }

        // แสดงจำนวนสินค้าทั้งหมด
        System.out.println(Product.getProductCount());
    }
}
