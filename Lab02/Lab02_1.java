import java.util.Scanner;

class Student {
    String studentId;
    String name;
}

public class Lab02_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // พิมพ์ข้อความตามโจทย์ (รับข้อมูลชุดเดียว)
        System.out.print("รหัสศึกษา: ");
        String studentId = scanner.nextLine();

        System.out.print("ชื่อ-นามสกุล: ");
        String name = scanner.nextLine();

        // สร้างออบเจกต์และเก็บข้อมูล
        Student student = new Student();
        student.studentId = studentId;
        student.name = name;

        // แสดงผลตามรูปแบบ Output ที่ต้องการ
        System.out.println(student.studentId);
        System.out.println(student.name);

        scanner.close();
    }
}

