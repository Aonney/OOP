import java.util.Scanner;

class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class ShoppingCart {
    Product[] items;
    int itemCount;
    ShoppingCart() {
        items = new Product[10];  
        itemCount = 0;      
    }
    void addProduct(Product p) {
        if (itemCount < 10) {  
            items[itemCount] = p;
            itemCount++;
        }
    }
    double calculateTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price;
        }
        return total;
    }
}
public class Lab02_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  
        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < N; i++) {
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            scanner.nextLine(); 

            Product product = new Product(name, price);
            cart.addProduct(product);
        }
        double totalPrice = cart.calculateTotalPrice();
        System.out.println(totalPrice);
        scanner.close();
    }
}
