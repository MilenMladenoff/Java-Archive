package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        if (input.contains(".")) {
            System.out.println("Rainy");
        } else {
            long number = Long.parseLong(input);

            if (Byte.MIN_VALUE <= number && number <= Byte.MAX_VALUE) {
                System.out.println("Sunny");
            } else if (Integer.MIN_VALUE <= number && number <= Integer.MAX_VALUE) {
                System.out.println("Cloudy");
            } else {
                System.out.println("Windy");
            }
        }
    }
}
