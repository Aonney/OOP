import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าจำนวนเต็มตัวแรก
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        // รับค่าจำนวนเต็มตัวที่สอง
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        // คำนวณผลบวก
        int sum = num1 + num2;

        // แสดงผลลัพธ์
        System.out.println("Sum = " + sum);
    }
}

