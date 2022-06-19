package Methods.Exercises;

import java.util.Scanner;

public class CubeProperties {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double side = Double.parseDouble(scan.nextLine());
        String parameter = scan.nextLine();

        calculateCubeProperties(side, parameter);
    }

    private static void calculateCubeProperties(double side, String parameter) {
        double result = 0.0;

        switch (parameter) {
            case "face":
                result = Math.sqrt(2 * Math.pow(side, 2));
                break;
            case "space":
                result = Math.sqrt(3 * Math.pow(side, 2));
                break;
            case "volume":
                result = Math.pow(side, 3);
                break;
            case "area":
                result = 6 * Math.pow(side, 2);
                break;
        }

        System.out.printf("%.2f", result);
    }
}
