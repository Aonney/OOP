import java.util.Scanner;

// คลาส Car ใช้แทนข้อมูลของรถยนต์ 1 คัน
class Car {
    // กำหนดตัวแปรแบบ private เพื่อห้ามเข้าถึงโดยตรงจากภายนอกคลาส
    private String model;  // รุ่นของรถ
    private int year;      // ปีที่ผลิต

    // Constructor สำหรับกำหนดค่าเริ่มต้นให้กับรถ
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getter สำหรับอ่านค่า model
    public String getModel() {
        return model;
    }

    // Getter สำหรับอ่านค่า year
    public int getYear() {
        return year;
    }

    // Setter สำหรับแก้ไขปีที่ผลิต
    public void setYear(int newYear) {
        this.year = newYear;
    }
}

public class Lab02_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // อ่านรุ่นรถที่ผู้ใช้ป้อน
        String model = scanner.nextLine();

        // อ่านปีที่ผลิตเดิม
        int year = scanner.nextInt();

        // อ่านปีใหม่ที่ต้องการแก้ไข
        int newYear = scanner.nextInt();

        // สร้างออบเจ็กต์ Car โดยใช้ข้อมูลที่ได้รับ
        Car car = new Car(model, year);

        // อัปเดตปีรถด้วยข้อมูลใหม่
        car.setYear(newYear);

        // แสดงผลรุ่นรถและปีที่ถูกแก้ไขแล้ว
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        scanner.close();
    }
}
