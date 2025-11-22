import java.util.Scanner;

public class Lab01_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            int value = sc.nextInt();
            sum += value;
        }

        System.out.println("Sum = " + sum);
    }
}
