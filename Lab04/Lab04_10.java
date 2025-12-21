import java.util.Scanner;

/* -------------------- TimePeriod Class -------------------- */
class TimePeriod {

    // Attributes
    private int startHour;
    private int endHour;

    // Constructor ที่ 1 : Default Constructor (9:00 - 17:00)
    public TimePeriod() {
        this(9, 17); // Constructor Chaining
    }

    // Constructor ที่ 2 : Main Constructor
    public TimePeriod(int startHour, int endHour) {

        // Validation 1: ชั่วโมงต้องอยู่ในช่วง 0 - 23
        if (startHour < 0) startHour = 0;
        if (startHour > 23) startHour = 23;

        if (endHour < 0) endHour = 0;
        if (endHour > 23) endHour = 23;

        // Validation 2: startHour ต้องน้อยกว่า endHour
        if (startHour > endHour) {
            int temp = startHour;
            startHour = endHour;
            endHour = temp;
        }

        // กำหนดค่าให้ Attributes
        this.startHour = startHour;
        this.endHour = endHour;
    }

    // แสดงช่วงเวลา
    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าโหมด
        int mode = sc.nextInt();

        TimePeriod period;

        if (mode == 1) {
            // โหมด 1 : ใช้ Default Constructor
            period = new TimePeriod();

        } else if (mode == 2) {
            // โหมด 2 : รับ startHour และ endHour
            int startHour = sc.nextInt();
            int endHour = sc.nextInt();
            period = new TimePeriod(startHour, endHour);

        } else {
            System.out.println("Invalid mode");
            return;
        }

        // แสดงผล
        period.displayPeriod();
    }
}
