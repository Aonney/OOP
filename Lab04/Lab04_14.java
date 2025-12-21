import java.util.Scanner;

/* -------------------- ScoreBoard Class -------------------- */
class ScoreBoard {

    private String gameName;
    private int[] scores;

    // Constructor หลัก (Shallow Copy)
    public ScoreBoard(String gameName, int[] scores) {
        this.gameName = gameName;
        this.scores = scores; // Shallow Copy (อ้างอิง array เดิม)
    }

    // Copy Constructor (Deep Copy)
    public ScoreBoard(ScoreBoard other) {
        this.gameName = other.gameName;

        // Deep Copy: สร้าง array ใหม่และคัดลอกค่าทีละตัว
        this.scores = new int[other.scores.length];
        for (int i = 0; i < other.scores.length; i++) {
            this.scores[i] = other.scores[i];
        }
    }

    // แสดงผลคะแนน
    public void displayScores() {
        System.out.print(gameName + ": ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับชื่อเกม
        String gameName = sc.nextLine();

        // รับคะแนนเริ่มต้น 3 ค่า
        int[] originalScores = new int[3];
        for (int i = 0; i < 3; i++) {
            originalScores[i] = sc.nextInt();
        }

        // รับค่าที่ใช้แก้ไขคะแนนภายนอก (เช่น 999 หรือ 555)
        int newScore = sc.nextInt();

        // 1. สร้าง ScoreBoard ต้นฉบับ (Shallow Copy)
        ScoreBoard sb1 = new ScoreBoard(gameName, originalScores);

        // 2. สร้าง ScoreBoard สำเนา (Deep Copy)
        ScoreBoard sb2 = new ScoreBoard(sb1);

        // 3. แก้ไข Array ต้นฉบับภายนอก
        originalScores[0] = newScore;

        // 4. แสดงผล
        sb1.displayScores();
        sb2.displayScores();
    }
}
