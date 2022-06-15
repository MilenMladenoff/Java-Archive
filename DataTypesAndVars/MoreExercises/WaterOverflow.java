package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int capacity = 255;
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int pour = Integer.parseInt(scan.nextLine());

            if (capacity < pour) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= pour;
            }
        }

        System.out.println(255 - capacity);
    }
}
