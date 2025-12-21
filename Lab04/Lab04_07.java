import java.util.Scanner;

/* -------------------- Resource Class -------------------- */
class Resource {

    // Attribute
    private String id;

    // Constructor
    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    // finalize method (เรียกโดย GC)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Resource " + id + " finalized (destroyed).");
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่า id ทั้ง 3 ค่า
        String id1 = sc.nextLine();
        String id2 = sc.nextLine();
        String id3 = sc.nextLine();

        // 1. สร้าง Resource 3 ตัว
        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        // 2. ทำให้ r1 และ r2 เป็น null (eligible for GC)
        r1 = null;
        r2 = null;

        // 3. ขอให้ GC ทำงาน
        System.gc();

        // 4. ทำให้ r3 เป็น null
        r3 = null;

        // 5. ขอให้ GC ทำงานอีกครั้ง
        System.gc();
    }
}
