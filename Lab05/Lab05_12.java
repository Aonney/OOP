import java.util.Scanner;

// ---------- Superclass ----------
class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

// ---------- Subclass : BasicService ----------
class BasicService extends Service {

    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05; // เพิ่มภาษี 5%
    }
}

// ---------- Subclass : PremiumService ----------
class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

// ---------- Main Class ----------
public class Lab05_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input BasicService
        String basicName = sc.nextLine();
        double basicPrice = sc.nextDouble();
        sc.nextLine(); // clear buffer

        // Input PremiumService
        String premiumName = sc.nextLine();
        double premiumPrice = sc.nextDouble();
        double premiumRate = sc.nextDouble();

        // 1. Create objects
        BasicService basic = new BasicService(basicName, basicPrice);
        PremiumService premium = new PremiumService(premiumName, premiumPrice, premiumRate);

        // 2. Store in Service array
        Service[] services = new Service[2];
        services[0] = basic;
        services[1] = premium;

        // 3. Calculate and display final prices
        for (Service s : services) {
            System.out.println(s.calculateFinalPrice());
        }

        sc.close();
    }
}
