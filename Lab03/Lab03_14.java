import java.util.Scanner;

// ================= BankAccount =================
class BankAccount1 {

    // Instance attribute
    private double balance;
    
    // Static attribute (shared across all accounts)
    private static int totalTransactionCount = 0;

    // Constructor
    public BankAccount1(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        System.out.println("Account created.");
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount <= balance) {
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Instance getter
    public double getBalance() {
        return balance;
    }

    // Static getter
    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

// ================= Main =================
public class Lab03_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount1 myAccount = null;

        int N = sc.nextInt();
        sc.nextLine(); // clear buffer

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine();

            if (command.equals("CREATE")) {
                double initial = sc.nextDouble();
                sc.nextLine(); // clear buffer
                myAccount = new BankAccount1(initial);

            } else if (command.equals("DEPOSIT")) {
                double amount = sc.nextDouble();
                sc.nextLine();
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.deposit(amount);
                }

            } else if (command.equals("WITHDRAW")) {
                double amount = sc.nextDouble();
                sc.nextLine();
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    myAccount.withdraw(amount);
                }

            } else if (command.equals("STATUS")) {
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }

            } else if (command.equals("GLOBAL STATUS")) {
                System.out.println(
                    "Total transactions: " + BankAccount1.getTotalTransactionCount()
                );
            }
        }
    }
}
