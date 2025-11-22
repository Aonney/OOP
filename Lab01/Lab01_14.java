import java.util.Scanner;

public class Lab01_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (R): ");
        int R = sc.nextInt();
        System.out.print("Enter number of columns (C): ");
        int C = sc.nextInt();

        sc.nextLine();
        char[][] map = new char[R][C];
        

        System.out.println("Enter the map (* = mine, . = empty):");
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);
            }
        }
        System.out.print("Enter target row: ");
        int targetR = sc.nextInt();
        System.out.print("Enter target column: ");
        int targetC = sc.nextInt();

        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } else {
            int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

            int count = 0;
            for (int k = 0; k < 8; k++) {
                int nr = targetR + dr[k];
                int nc = targetC + dc[k];

                if (nr >= 0 && nr < R && nc >= 0 && nc < C) {
                    if (map[nr][nc] == '*') {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
