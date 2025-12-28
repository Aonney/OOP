import java.util.Scanner;

// ---------- Superclass ----------
class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

// ---------- Subclass : TextDocument ----------
class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

// ---------- Subclass : PDFDocument ----------
class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

// ---------- Main Class ----------
public class Lab05_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input TextDocument 1
        String textTitle1 = sc.nextLine();
        int wordCount1 = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Input PDFDocument 1
        String pdfTitle1 = sc.nextLine();
        int pageCount1 = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Input TextDocument 2
        String textTitle2 = sc.nextLine();
        int wordCount2 = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Input PDFDocument 2
        String pdfTitle2 = sc.nextLine();
        int pageCount2 = sc.nextInt();

        // 1. Create objects
        TextDocument t1 = new TextDocument(textTitle1, wordCount1);
        PDFDocument p1 = new PDFDocument(pdfTitle1, pageCount1);
        TextDocument t2 = new TextDocument(textTitle2, wordCount2);
        PDFDocument p2 = new PDFDocument(pdfTitle2, pageCount2);

        // 2. Store in Document array
        Document[] docs = { t1, p1, t2, p2 };

        // 3. Count total pages (PDF only)
        int totalPages = 0;
        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d; // Downcasting
                totalPages += pdf.pageCount;
            }
        }

        // 4. Display details
        for (Document d : docs) {
            d.displayDetails();
        }

        // 5. Display total pages
        System.out.println("Total Pages: " + totalPages);

        sc.close();
    }
}
