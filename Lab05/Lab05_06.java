// ---------------- Superclass ----------------
class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

// ---------------- Subclass : Video ----------------
class Video extends Media {
    protected int duration;

    public Video(String title, int duration) {
        super(title);              // ต้องเป็นคำสั่งแรก
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println(
            "Processing video: " + title + " for " + duration + " minutes."
        );
    }
}

// ---------------- Subclass : Audio ----------------
class Audio extends Media {
    protected String quality;

    public Audio(String title, String quality) {
        super(title);              // ต้องเป็นคำสั่งแรก
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println(
            "Processing audio: " + title + " with " + quality + " quality."
        );
    }
}

// ---------------- Utility Class ----------------
class Processor {
    public static void runProcessor(Media m) {
        m.process();
    }
}

// ---------------- Main Class ----------------
public class Lab05_06 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        // Video input
        String videoTitle = sc.nextLine();
        int duration = sc.nextInt();
        sc.nextLine(); // เคลียร์ Enter

        // Audio input
        String audioTitle = sc.nextLine();
        String quality = sc.nextLine();

        Media video = new Video(videoTitle, duration);
        Media audio = new Audio(audioTitle, quality);

        Processor.runProcessor(video);
        Processor.runProcessor(audio);

        sc.close();
    }
}
