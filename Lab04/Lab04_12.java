import java.util.Scanner;

/* -------------------- Mutable Component -------------------- */
class Schedule {

    private int hour;

    public Schedule(int hour) {
        this.hour = hour;
    }

    public void setHour(int newHour) {
        this.hour = newHour;
    }

    public int getHour() {
        return hour;
    }
}

/* -------------------- Container Class -------------------- */
class EmployeeSchedule {

    private String name;
    private Schedule schedule;

    // Constructor หลัก
    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    // Copy Constructor (Deep Copy)
    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name; // Shallow Copy (String)
        this.schedule = new Schedule(other.schedule.getHour()); // Deep Copy
    }

    public void displaySchedule() {
        System.out.println(name + ": " + schedule.getHour() + ":00");
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int startHour = sc.nextInt();
        int newHour = sc.nextInt();

        // 1. สร้าง Schedule ต้นฉบับ
        Schedule sch1 = new Schedule(startHour);

        // 2. สร้าง EmployeeSchedule ต้นฉบับ
        EmployeeSchedule emp1 = new EmployeeSchedule(name, sch1);

        // 3. สร้าง EmployeeSchedule สำเนา (Deep Copy)
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        // 4. แก้ไข Schedule ต้นฉบับ
        sch1.setHour(newHour);

        // 5-6. แสดงผล
        emp1.displaySchedule();
        emp2.displaySchedule();
    }
}
