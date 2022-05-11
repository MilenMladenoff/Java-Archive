package DataTypesAndVars.Lab;

import java.util.Scanner;

public class CircleAreaPrecision12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double circleArea = Math.PI * r * r;
        System.out.printf("%.12f", circleArea);
    }
}
