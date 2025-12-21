import java.util.Scanner;

/* -------------------- Color Class (Immutable) -------------------- */
class Color {

    // Attributes (immutable)
    private final int red;
    private final int green;
    private final int blue;

    // Constructor
    public Color(int r, int g, int b) {
        this.red = validate(r);
        this.green = validate(g);
        this.blue = validate(b);
    }

    // Validation: ค่าต้องอยู่ในช่วง 0 - 255
    private int validate(int value) {
        if (value < 0) {
            return 0;
        } else if (value > 255) {
            return 255;
        }
        return value;
    }

    // Getters
    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    // แสดงค่า RGB
    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่า R, G, B
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        // สร้างออบเจ็กต์ Color
        Color color = new Color(r, g, b);

        // แสดงผล
        color.displayRGB();
    }
}
