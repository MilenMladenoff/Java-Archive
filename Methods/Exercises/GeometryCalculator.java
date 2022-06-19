package Methods.Exercises;

import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        double area = 0.0;

        switch (figure) {
            case "triangle":
                double side = Double.parseDouble(scan.nextLine());
                double height = Double.parseDouble(scan.nextLine());
                area = side * height / 2;
                break;
            case "square":
                side = Double.parseDouble(scan.nextLine());
                area = Math.pow(side, 2);
                break;
            case "rectangle":
                double width = Double.parseDouble(scan.nextLine());
                height = Double.parseDouble(scan.nextLine());
                area = width * height;
                break;
            case "circle":
                double radius = Double.parseDouble(scan.nextLine());
                area = Math.PI * Math.pow(radius, 2);
                break;
        }

        printFigureArea(area);
    }

    private static void printFigureArea(double area) {
        System.out.printf("%.2f", area);
    }
}
