import java.util.Scanner;

// ---------- Superclass ----------
class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

// ---------- Subclass ----------
class Car1 extends RentalVehicle {

    public Car1(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0; // ค่าประกัน
    }
}

// ---------- Subclass ----------
class Motorcycle extends RentalVehicle {

    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10; // ค่าดำเนินการ 10%
    }
}

// ---------- Main Class ----------
public class Lab05_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Car
        String carModel = sc.nextLine();
        double carRate = sc.nextDouble();
        sc.nextLine(); // clear buffer

        // Input Motorcycle
        String motoModel = sc.nextLine();
        double motoRate = sc.nextDouble();

        // 1. Create objects
        RentalVehicle car = new Car1(carModel, carRate);
        RentalVehicle motorcycle = new Motorcycle(motoModel, motoRate);

        // 2. Store in array
        RentalVehicle[] vehicles = { car, motorcycle };

        // 3. Calculate total fee
        double totalFee = 0.0;
        for (RentalVehicle v : vehicles) {
            totalFee += v.calculateFee();
        }

        // 4. Display result
        System.out.println(totalFee);

        sc.close();
    }
}
