import java.util.Scanner;

/* -------------------- Movie Class -------------------- */
class Movie {

    // Attributes
    private String title;
    private String director;
    private double rating;

    // Constructor ที่ 1 : รับเฉพาะชื่อเรื่อง
    public Movie(String title) {
        this(title, "Unknown"); // chaining ไป constructor ที่ 2
    }

    // Constructor ที่ 2 : รับชื่อเรื่องและผู้กำกับ
    public Movie(String title, String director) {
        this(title, director, 0.0); // chaining ไป constructor หลัก
    }

    // Constructor ที่ 3 : Constructor หลัก
    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;

        // Validation rating (0.0 - 10.0)
        if (rating < 0.0) {
            this.rating = 0.0;
        } else if (rating > 10.0) {
            this.rating = 10.0;
        } else {
            this.rating = rating;
        }
    }

    // แสดงรายละเอียดภาพยนตร์
    public void displayDetails() {
        System.out.println(
            "Title: " + title +
            ", Director: " + director +
            ", Rating: " + rating
        );
    }
}

/* -------------------- Main Class -------------------- */
public class Lab04_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // รับค่าโหมด
        int mode = sc.nextInt();
        sc.nextLine(); // เคลียร์ buffer

        Movie movie;

        if (mode == 1) {
            // โหมด 1 : รับเฉพาะชื่อเรื่อง
            String title = sc.nextLine();
            movie = new Movie(title);

        } else if (mode == 2) {
            // โหมด 2 : รับชื่อเรื่องและผู้กำกับ
            String title = sc.nextLine();
            String director = sc.nextLine();
            movie = new Movie(title, director);

        } else if (mode == 3) {
            // โหมด 3 : รับชื่อเรื่อง ผู้กำกับ และคะแนน
            String title = sc.nextLine();
            String director = sc.nextLine();
            double rating = sc.nextDouble();
            movie = new Movie(title, director, rating);

        } else {
            System.out.println("Invalid mode");
            return;
        }

        // แสดงผล
        movie.displayDetails();
    }
}
