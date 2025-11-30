public class TempConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
import java.util.Scanner;

public class Lab02_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mode = sc.nextLine();      // "C TO F" หรือ "F TO C"
        double temp = sc.nextDouble();    // ค่าอุณหภูมิ

        if (mode.equals("C TO F")) {
            double result = TempConverter.celsiusToFahrenheit(temp);
            System.out.println(result);
        } 
        else if (mode.equals("F TO C")) {
            double result = TempConverter.fahrenheitToCelsius(temp);
            System.out.println(result);
        } 
        else {
            System.out.println("Invalid mode");
        }
    }
}
