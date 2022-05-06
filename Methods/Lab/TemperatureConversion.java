package Methods.Lab;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fahrenheit = Double.parseDouble(scan.nextLine());
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f", celsius);
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
