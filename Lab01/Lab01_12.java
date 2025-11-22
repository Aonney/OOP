import java.util.Scanner;

public class Lab01_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int N = sc.nextInt();
        int[] productIDs = new int[N];
        int[] stockQuantities = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Enter Product ID for product " + (i + 1) + ": ");
            productIDs[i] = sc.nextInt();
            System.out.print("Enter Stock Quantity for product " + (i + 1) + ": ");
            stockQuantities[i] = sc.nextInt();
        }
        System.out.print("Enter Product ID to search: ");
        int searchID = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (productIDs[i] == searchID) {
                System.out.println("Stock Quantity = " + stockQuantities[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product " + searchID + " not found");
        }
    }
}
