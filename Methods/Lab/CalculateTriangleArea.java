package Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double triangleArea = calculateTriangleArea(width, height);
        DecimalFormat df = new DecimalFormat("#.############################################################");
        String formattedArea = df.format(triangleArea);
        System.out.println(formattedArea);
    }

    private static double calculateTriangleArea(double width, double height) {
        return width * height / 2;
    }
}
