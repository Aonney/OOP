class Employee {
    protected double salary;

    // โบนัสพื้นฐาน 10%
    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {

    @Override
    public double calculateBonus() {
        // เรียกโบนัสพื้นฐานจากคลาสแม่
        double baseBonus = super.calculateBonus();

        // โบนัสเพิ่มพิเศษ 5%
        double extraBonus = salary * 0.05;

        // รวมเป็น 15%
        return baseBonus + extraBonus;
    }
}

public class Lab05_03 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // รับเงินเดือน
        double salary = sc.nextDouble();

        // 1. สร้างออบเจ็กต์ Manager
        Manager manager = new Manager();

        // 2. กำหนดค่า salary
        manager.salary = salary;

        // 3. คำนวณและแสดงโบนัส
        System.out.println(manager.calculateBonus());

        sc.close();
    }
}
