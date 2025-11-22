import java.util.Scanner;

public class Lab01_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        int[] numbers = new int[N];
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / N;
        System.out.println("Average = " + average);
    }
}
