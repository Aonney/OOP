import java.util.Scanner;

// คลาส Course สำหรับเก็บข้อมูลรายวิชา
class Course {
    String courseId;      // เก็บรหัสวิชา
    String courseName;    // เก็บชื่อวิชา
    
    // Constructor รับค่า courseId และ courseName
    Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    // เมธอดเพื่อส่งข้อมูลวิชากลับไปเป็นข้อความ
    String getCourseInfo() {
        return courseId + ": " + courseName;
    }
}

// คลาส Student12 สำหรับเก็บข้อมูลนักเรียน และข้อมูลรายวิชาที่ลงทะเบียน
class Student12 {
    String studentName;     // ชื่อนักเรียน
    Course enrolledCourse;  // วิชาที่นักเรียนลงทะเบียน (ชนิดเป็นคลาส Course)

    // Constructor รับชื่อนักเรียนและวัตถุ Course ที่ลงทะเบียน
    Student12(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    // เมธอดแสดงผลข้อมูลการลงทะเบียนเรียน
    void displayEnrollment() {
        System.out.println("Student: " + studentName);
        System.out.println("Enrolled in: " + enrolledCourse.getCourseInfo());
    }
}

public class Lab02_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับรหัสวิชา
        String courseId = scanner.nextLine();
        
        // รับชื่อวิชา
        String courseName = scanner.nextLine();
        
        // รับชื่อนักเรียน
        String studentName = scanner.nextLine();

        // สร้างออบเจ็กต์ Course โดยใช้ข้อมูลที่รับมา
        Course course = new Course(courseId, courseName);
        
        // สร้างออบเจ็กต์ Student12 พร้อมข้อมูลนักเรียนและรายวิชาที่ลงทะเบียน
        Student12 student = new Student12(studentName, course);

        // แสดงผลข้อมูลที่ลงทะเบียน
        student.displayEnrollment();

        scanner.close();
    }
}
