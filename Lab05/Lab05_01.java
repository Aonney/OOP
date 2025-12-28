
class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Lab05_01 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // รับชื่อและอายุ
        String name = sc.nextLine();
        int age = sc.nextInt();

        // 1. สร้างออบเจ็กต์ Dog
        Dog myDog = new Dog();

        // 2. กำหนดค่า name และ age (เข้าถึงจาก Animal โดยตรง)
        myDog.name = name;
        myDog.age = age;

        // 3. เรียกเมธอดของ Dog
        myDog.makeSound();

        // 4. เรียกเมธอดที่สืบทอดมาจาก Animal
        myDog.displayInfo();

        sc.close();
    }
}
