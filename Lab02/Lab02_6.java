import java.util.Scanner;

// คลาส BankAccount
class BankAccount {
    String ownerName;
    double balance;

    // Constructor
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Method ฝากเงิน
    public void deposit(double amount) {
        balance += amount;
    }

    // Method แสดงผลสรุป
    public void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

// คลาสหลัก Main
public class Lab02_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลเจ้าของบัญชี
        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();

        // รับยอดเงินเริ่มต้น
        System.out.print("Enter initial balance: ");
        double initialBalance = Double.parseDouble(scanner.nextLine());

        // รับจำนวนเงินที่จะฝาก
        System.out.print("Enter deposit amount: ");
        double depositAmount = Double.parseDouble(scanner.nextLine());

        // สร้างอ็อบเจกต์ BankAccount
        BankAccount account = new BankAccount(ownerName, initialBalance);

        // ฝากเงิน
        account.deposit(depositAmount);

        // แสดงผลสรุป
        System.out.println("\n--- Account Summary ---");
        account.displaySummary();

        scanner.close();
    }
}
