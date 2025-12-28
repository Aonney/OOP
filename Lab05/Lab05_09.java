import java.util.Scanner;

// ---------- Superclass ----------
class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

// ---------- Subclass : PhysicalProduct ----------
class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

// ---------- Subclass : DigitalSubscription ----------
class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

// ---------- Main Class ----------
public class Lab05_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Physical Product
        String physicalName = sc.nextLine();
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Input Digital Subscription
        String digitalName = sc.nextLine();
        double monthlyCost = sc.nextDouble();
        int months = sc.nextInt();

        // 1. Create objects
        PhysicalProduct p = new PhysicalProduct(physicalName, unitPrice, quantity);
        DigitalSubscription d = new DigitalSubscription(digitalName, monthlyCost, months);

        // 2. Store in Item array
        Item[] items = new Item[2];
        items[0] = p;
        items[1] = d;

        // 3. Calculate total value
        double totalValue = 0.0;
        for (Item item : items) {
            totalValue += item.getValue();
        }

        // 4. Display result
        System.out.println("Total Value: " + totalValue);

        sc.close();
    }
}
