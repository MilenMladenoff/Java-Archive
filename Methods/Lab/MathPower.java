package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        double result = raiseToPower(number, power);
        DecimalFormat df = new DecimalFormat("#.####");
        String formattedResult = df.format(result);
        System.out.println(formattedResult);
    }

    private static double raiseToPower(double number, int power) {
        return Math.pow(number, power);
    }
}
