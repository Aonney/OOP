import java.util.Scanner;

// ---------- Superclass ----------
class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String id, double baseFee) {
        this.trackingId = id;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

// ---------- Subclass ----------
class StandardShipping extends Shipping {

    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05; // เพิ่มค่าดำเนินการ 5%
    }
}

// ---------- Subclass ----------
class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

// ---------- Main Class ----------
public class Lab05_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input StandardShipping
        String stdId = sc.nextLine();
        double stdFee = sc.nextDouble();
        sc.nextLine(); // clear buffer

        // Input PremiumShipping
        String preId = sc.nextLine();
        double preFee = sc.nextDouble();
        double insurance = sc.nextDouble();

        // 1. Create objects
        StandardShipping standard = new StandardShipping(stdId, stdFee);
        PremiumShipping premium = new PremiumShipping(preId, preFee, insurance);

        // 2. Store in Shipping array
        Shipping[] shippings = { standard, premium };

        // 3. Calculate and display fees
        for (Shipping s : shippings) {
            System.out.println(s.calculateTotalFee());
        }

        sc.close();
    }
}
