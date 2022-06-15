package DataTypesAndVars.MoreExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TouristInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String imperialUnit = scan.nextLine();
        double valueToConvert = Double.parseDouble(scan.nextLine());
        double convertedValue = 0.0;
        String metricUnit = "";

        switch (imperialUnit) {
            case "miles":
                convertedValue = valueToConvert * 1.6;
                metricUnit = "kilometers";
                break;
            case "inches":
                convertedValue = valueToConvert * 2.54;
                metricUnit = "centimeters";
                break;
            case "feet":
                convertedValue = valueToConvert * 30;
                metricUnit = "centimeters";
                break;
            case "yards":
                convertedValue = valueToConvert * 0.91;
                metricUnit = "meters";
                break;
            case "gallons":
                convertedValue = valueToConvert * 3.8;
                metricUnit = "liters";
                break;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.###################");
        String formattedInputValue = decimalFormat.format(valueToConvert);
        System.out.printf("%s %s = %.2f %s", formattedInputValue, imperialUnit, convertedValue, metricUnit);
    }
}
