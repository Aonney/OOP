import java.util.Scanner;

/* -------------------- ImmutableAccount Class -------------------- */
class ImmutableAccount {

    // Attributes (immutable)
    private final String accountId;
    private final double balance;

    // Constructor หลัก
    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;
        if (balance < 0) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }

    // Copy Constructor
    public ImmutableAccount(ImmutableAccount other) {
        this.accountId = other.accountId;
        this.balance = other.balance;
    }

    // Getters
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    // ฝากเงิน (คืนค่าออบเจ็กต์ใหม่)
    public ImmutableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmutableAccount(accountId, balance + amount);
        } else {
            System.out.println("Invalid deposit amount.");
            return this;
        }
    }

    // ถอนเงิน (คืนค่าออบเจ็กต์ใหม่)
    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return this;
        } else {
            return new ImmutableAccount(accountId, balance - amount);
        }
    }

    // แสดงข้อมูลบัญชี
    public void displayInfo() {
        System.out.println("ID: " + accountId + ", Balance: " + balance);
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับข้อมูล
        String id = sc.nextLine();
        double initialBalance = sc.nextDouble();
        double depositAmount = sc.nextDouble();
        double withdrawAmount = sc.nextDouble();

        // 1. สร้างบัญชีเริ่มต้น
        ImmutableAccount acc1 = new ImmutableAccount(id, initialBalance);

        // 2. ฝากเงิน
        ImmutableAccount acc2 = acc1.deposit(depositAmount);

        // 3. ถอนเงิน
        ImmutableAccount acc3 = acc2.withdraw(withdrawAmount);

        // 4. แสดงผล
        acc1.displayInfo();
        acc3.displayInfo();
    }
}
