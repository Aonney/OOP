import java.util.Scanner;

// คลาส Rectangle
class Rectangle {
    double width;
    double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method คำนวณพื้นที่
    public double getArea() {
        return width * height;
    }

    // Method คำนวณเส้นรอบรูป
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

// คลาสหลัก Main
public class Lab02_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่าความกว้าง
        System.out.print("Enter width: ");
        double width = Double.parseDouble(scanner.nextLine());

        // รับค่าความสูง
        System.out.print("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());

        // สร้างอ็อบเจกต์ Rectangle
        Rectangle rectangle = new Rectangle(width, height);

        // แสดงผลพื้นที่และเส้นรอบรูป
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        scanner.close();
    }
}
