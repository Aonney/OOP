import java.util.Scanner;

// ================== BankAccount.java ==================
class BankAccount {
    // Attribute แบบ private
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter: ดูยอดเงินคงเหลือ
    public double getBalance() {
        return balance;
    }

    // ฝากเงิน
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // ถอนเงิน
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

// ================== Main ==================
public class Lab03_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าจากผู้ใช้
        double initialBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();

        // สร้างออบเจ็กต์ BankAccount
        BankAccount account = new BankAccount(initialBalance);

        // ฝากเงิน
        account.deposit(depositAmount);

        // ถอนเงิน
        account.withdraw(withdrawAmount);

        // แสดงยอดเงินคงเหลือสุดท้าย
        System.out.println("Final Balance: " + account.getBalance());
    }
}
