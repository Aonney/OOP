import java.util.Scanner;

// ================== Employee.java ==================
class Employee {
    // Attributes แบบ private
    private String employeeId;   // Read-only
    private String department;   // Writable

    // Constructor
    public Employee(String employeeId, String department) {
        this.employeeId = employeeId;
        this.department = department;
    }

    // Getter: อ่านรหัสพนักงาน (Read-only)
    public String getEmployeeId() {
        return employeeId;
    }

    // Getter: อ่านแผนก
    public String getDepartment() {
        return department;
    }

    // Setter: แก้ไขแผนกได้
    public void setDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}

// ================== Main ==================
public class Lab03_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลจากผู้ใช้
        String employeeId = sc.nextLine();
        String initialDepartment = sc.nextLine();
        String newDepartment = sc.nextLine();

        // สร้างออบเจ็กต์ Employee
        Employee emp = new Employee(employeeId, initialDepartment);

        // อัปเดตแผนกใหม่
        emp.setDepartment(newDepartment);

        // แสดงผลลัพธ์
        System.out.println(emp.getEmployeeId());
        System.out.println(emp.getDepartment());
    }
}
