import java.util.Scanner;

class Address {
    String street;
    String city;
    String zipCode;
    Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
    String getFullAddress() {
        return street + ", " + city + ", " + zipCode;
    }
}
class Student {
    String name;
    Address address;
    Student9(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    void displayProfile() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getFullAddress());
    }
}
public class Lab02_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String street = scanner.nextLine();
        String city = scanner.nextLine();
        String zipCode = scanner.nextLine();
        Address address = new Address(street, city, zipCode);
        Student9 student = new Student9(name, address);
        student.displayProfile();
        
        scanner.close();
    }
}
