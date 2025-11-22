import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าความกว้าง
        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        // รับค่าความสูง
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        // คำนวณพื้นที่
        double area = width * height;

        // แสดงผลลัพธ์
        System.out.println("Area = " + area);
    }
}
