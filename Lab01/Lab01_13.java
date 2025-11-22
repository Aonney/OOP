import java.util.Scanner;

public class Lab01_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (R): ");
        int R = sc.nextInt();
        System.out.print("Enter number of columns (C): ");
        int C = sc.nextInt();
        int[][] grid = new int[R][C];
        System.out.println("Enter server status (0=Offline, 1=Online) row by row:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        int onlineCount = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    onlineCount++;
                }
            }
        }
        System.out.println("Total Online servers = " + onlineCount);
    }
}
