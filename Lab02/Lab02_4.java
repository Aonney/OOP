import java.util.Scanner;

class Student {

    // Attributes
    String name;
    int midtermScore;
    int finalScore;

    // Constructor
    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    // Method: คำนวณคะแนนเฉลี่ย
    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }

    // Method: แสดงผลสรุป
    public void displaySummary() {
        double average = calculateAverage();
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + average);
        if (average >= 50.0) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
    }
}

public class Lab02_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // รับข้อมูลนักเรียน
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter midterm score: ");
        int midterm = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter final score: ");
        int finalScore = Integer.parseInt(scanner.nextLine());

        // สร้างอ็อบเจกต์ Student
        Student student = new Student(name, midterm, finalScore);

        // เรียกใช้ displaySummary() แสดงผล
        System.out.println("\n--- Student Summary ---");
        student.displaySummary();

        scanner.close();
    }
}
