// ---------------- Superclass ----------------
class Vehicle {
    protected String color;

    // Constructor ของคลาสแม่
    public Vehicle(String color) {
        this.color = color;
    }
}

// ---------------- Subclass ----------------
class Car extends Vehicle {
    protected int wheels;

    // Constructor ของคลาสลูก
    public Car(String color, int wheels) {
        super(color);      // เรียก Constructor ของ Vehicle
        this.wheels = wheels;
    }

    // แสดงรายละเอียดรถ
    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

// ---------------- Main Class ----------------
public class Lab05_04 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // รับสีและจำนวนล้อ
        String color = sc.nextLine();
        int wheels = sc.nextInt();

        // 1. สร้างออบเจ็กต์ Car ด้วย Constructor ที่รับ 2 ค่า
        Car car = new Car(color, wheels);

        // 2. เรียกเมธอด displayDetails()
        car.displayDetails();

        sc.close();
    }
}
