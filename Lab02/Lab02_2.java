import java.util.Scanner;

class Student {

    String studentId;  // Attribute 1
    String name;       // Attribute 2

    // Method แสดงผลข้อมูลในอ็อบเจกต์
    void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
    }
}

public class Lab02_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Student ID");
        System.out.println("Full Name");

        // รับข้อมูล
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();

        // สร้างอ็อบเจกต์ Student
        Student student = new Student();
        student.studentId = studentId;
        student.name = name;

        // เรียกใช้เมธอด displayInfo()
        student.displayInfo();

        scanner.close();
    }
}
