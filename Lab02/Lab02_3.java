import java.util.Scanner;

class Student {

    // Instance Attributes
    String studentId;
    String name;

    // Static Attribute (นับจำนวนอ็อบเจกต์)
    static int studentCount = 0;

    // Constructor
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        studentCount++; // เพิ่มจำนวนอ็อบเจกต์ทุกครั้งที่สร้าง
    }
}

public class Lab02_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // รับจำนวนเต็ม N
        System.out.print("Enter number of students: ");
        int N = Integer.parseInt(scanner.nextLine());

        // สร้างอ็อบเจกต์นักเรียน N คน
        for (int i = 1; i <= N; i++) {
            System.out.println("\n--- Enter data for student " + i + " ---");

            System.out.print("Student ID: ");
            String studentId = scanner.nextLine();

            System.out.print("Full Name: ");
            String name = scanner.nextLine();

            // สร้างอ็อบเจกต์ Student ใหม่
            Student student = new Student(studentId, name);
        }

        // แสดงผลจำนวนอ็อบเจกต์ทั้งหมด
        System.out.println("\nTotal number of students: " + Student.studentCount);

        scanner.close();
    }
}
