import java.util.Scanner;

// ================== Player.java ==================
class Player {
    // Attribute แบบ private
    private int score;

    // Constructor รับคะแนนเริ่มต้น
    public Player(int initialScore) {
        this.score = initialScore;
    }

    // Getter: คืนค่าคะแนน
    public int getScore() {
        return score;
    }

    // Setter: อัปเดตคะแนนใหม่
    public void setScore(int newScore) {
        this.score = newScore;
    }
}

// ================== Main ==================
public class Lab03_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับคะแนนเริ่มต้น
        int initialScore = sc.nextInt();

        // รับคะแนนที่อัปเดต
        int updatedScore = sc.nextInt();

        // สร้างออบเจ็กต์ Player ด้วยคะแนนเริ่มต้น
        Player player = new Player(initialScore);

        // อัปเดตคะแนน
        player.setScore(updatedScore);

        // แสดงผลคะแนนล่าสุด
        System.out.println(player.getScore());
    }
}
