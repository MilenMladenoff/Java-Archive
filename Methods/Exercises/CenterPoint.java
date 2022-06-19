package Methods.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        printPointClosestToCenter(x1, y1, x2, y2);
    }

    private static void printPointClosestToCenter(double x1, double y1, double x2, double y2) {
        double point1 = Math.abs(x1) + Math.abs(y1);
        double point2 = Math.abs(x2) + Math.abs(y2);
        DecimalFormat decimalFormat = new DecimalFormat("#.################");

        if (point1 <= point2) {
            System.out.printf("(%s, %s)", decimalFormat.format(x1), decimalFormat.format(y1));
        } else {
            System.out.printf("(%s, %s)", decimalFormat.format(x2), decimalFormat.format(y2));
        }
    }
}
