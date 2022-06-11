package DataTypesAndVars.Exercises;

import java.util.Scanner;

public class ComparingFloats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double eps = 0.000001;
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double diff = Math.abs(a - b);

        if (diff < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
