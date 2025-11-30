import java.util.Scanner;

class BankAccount {
    private String ownerName;
    private double balance;

    // Constructor
    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // Method ถอนเงิน
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Method แสดงยอดเงินคงเหลือ
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูล
        String name = sc.nextLine();
        double initialBalance = Double.parseDouble(sc.nextLine());
        double withdraw1 = Double.parseDouble(sc.nextLine());
        double withdraw2 = Double.parseDouble(sc.nextLine());

        // สร้างออบเจ็กต์
        BankAccount acc = new BankAccount(name, initialBalance);

        // ถอนเงิน 2 ครั้ง
        acc.withdraw(withdraw1);
        acc.withdraw(withdraw2);

        // แสดงผลยอดเงินคงเหลือ
        acc.displayBalance();
    }
}
