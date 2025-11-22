import java.util.Scanner;

public class Lab01_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }       
        scanner.close();
    }
}
