// ---------------- Superclass ----------------
class Shape {
    protected String name;

    public double calculateArea() {
        return 0.0;
    }
}

// ---------------- Subclass : Circle ----------------
class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

// ---------------- Subclass : Rectangle ----------------
class Rectangle extends Shape {
    protected double width;
    protected double height;

    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// ---------------- Main Class ----------------
public class Lab05_05 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // รับค่ารัศมีของวงกลม
        double radius = sc.nextDouble();

        // รับค่าความกว้างและความสูงของสี่เหลี่ยม
        double width = sc.nextDouble();
        double height = sc.nextDouble();

        // 1. สร้างออบเจ็กต์ Circle และ Rectangle
        Shape c = new Circle("Circle", radius);
        Shape r = new Rectangle("Rectangle", width, height);

        // 2. สร้าง Array ของ Shape
        Shape[] shapes = { c, r };

        // 3. วนลูปเรียก calculateArea()
        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }

        sc.close();
    }
}
