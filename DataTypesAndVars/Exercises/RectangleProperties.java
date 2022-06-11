package DataTypesAndVars.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());

        double perimeter = width * 2 + height * 2;
        double area = width * height;
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        DecimalFormat decimalFormat = new DecimalFormat("#.#############");
        String formattedPerimeter = decimalFormat.format(perimeter);
        String formattedArea = decimalFormat.format(area);
        String formattedDiagonal = decimalFormat.format(diagonal);

        System.out.println(formattedPerimeter);
        System.out.println(formattedArea);
        System.out.println(formattedDiagonal);
    }
}
