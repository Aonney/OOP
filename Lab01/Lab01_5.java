import java.util.Scanner;

public class Lab01_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter menu number (1-4): ");
        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("Americano");
        } else if (menu == 2) {
            System.out.println("Latte");
        } else if (menu == 3) {
            System.out.println("Espresso");
        } else if (menu == 4) {
            System.out.println("Mocha");
        } else {
            System.out.println("Invalid Menu");
        }
    }
}
