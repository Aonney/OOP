import java.util.Scanner;

// ================== InventoryItem.java ==================
class InventoryItem {
    // Attributes แบบ private
    private String productName;
    private int stock;

    // Constructor
    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;
        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    // Getter: ชื่อสินค้า
    public String getProductName() {
        return productName;
    }

    // Getter: จำนวนสต็อก
    public int getStock() {
        return stock;
    }

    // เพิ่มสต็อก
    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // ขายสินค้า
    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount <= stock) {
            stock -= amount;
            System.out.println("Sale successful.");
        } else {
            System.out.println("Not enough stock.");
        }
    }
}

// ================== Main ==================
public class Lab03_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับชื่อสินค้า
        String productName = sc.nextLine();

        // รับสต็อกเริ่มต้น
        int initialStock = sc.nextInt();

        // สร้างออบเจ็กต์ InventoryItem
        InventoryItem item = new InventoryItem(productName, initialStock);

        // รับจำนวนคำสั่ง
        int N = sc.nextInt();

        // วนลูปรับคำสั่ง
        for (int i = 0; i < N; i++) {
            String command = sc.next();
            int amount = sc.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        // แสดงผลสต็อกคงเหลือล่าสุด
        System.out.println("Final Stock: " + item.getStock());
    }
}
