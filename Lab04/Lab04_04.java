import java.util.Scanner;

/* -------------------- Location Class -------------------- */
class Location {

    // Attributes
    private double latitude;
    private double longitude;

    // Constructor หลัก
    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Copy Constructor
    public Location(Location other) {
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    // เปลี่ยนค่า latitude
    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }

    // แสดงข้อมูลพิกัด
    public void displayInfo() {
        System.out.println("Lat: " + latitude + ", Lon: " + longitude);
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าพิกัดเริ่มต้นและค่าละติจูดใหม่
        double lat = sc.nextDouble();
        double lon = sc.nextDouble();
        double newLat = sc.nextDouble();

        // 1. สร้างออบเจ็กต์ต้นฉบับ
        Location loc1 = new Location(lat, lon);

        // 2. สร้างออบเจ็กต์สำเนา (Copy Constructor)
        Location loc2 = new Location(loc1);

        // 3. แก้ไขค่า latitude ของต้นฉบับ
        loc1.setLatitude(newLat);

        // 4. แสดงผลลัพธ์
        loc1.displayInfo(); // บรรทัดที่ 1
        loc2.displayInfo(); // บรรทัดที่ 2
    }
}
