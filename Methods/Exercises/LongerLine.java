package Methods.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x3 = Double.parseDouble(scan.nextLine());
        double y3 = Double.parseDouble(scan.nextLine());
        double x4 = Double.parseDouble(scan.nextLine());
        double y4 = Double.parseDouble(scan.nextLine());

        double line1 = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double line2 = Math.sqrt(Math.pow((x3 - x4), 2) + Math.pow((y3 - y4), 2));

        if (line1 >= line2) {
            printPointClosestToCenter(x1, y1, x2, y2);
        } else {
            printPointClosestToCenter(x3, y3, x4, y4);
        }
    }

    private static void printPointClosestToCenter(double x1, double y1, double x2, double y2) {
        double point1 = Math.abs(x1) + Math.abs(y1);
        double point2 = Math.abs(x2) + Math.abs(y2);
        DecimalFormat decimalFormat = new DecimalFormat("#.################");

        if (point1 <= point2) {
            System.out.printf("(%s, %s)", decimalFormat.format(x1), decimalFormat.format(y1));
            System.out.printf("(%s, %s)", decimalFormat.format(x2), decimalFormat.format(y2));
        } else {
            System.out.printf("(%s, %s)", decimalFormat.format(x2), decimalFormat.format(y2));
            System.out.printf("(%s, %s)", decimalFormat.format(x1), decimalFormat.format(y1));
        }
    }
}
