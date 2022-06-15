package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double maxKegVolume = 0.0;
        String biggestKeg = "";

        for (int i = 1; i <= n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double currentKegVolume = Math.PI * Math.pow(radius, 2) * height;

            if (currentKegVolume >= maxKegVolume) {
                maxKegVolume = currentKegVolume;
                biggestKeg = model;
            }
        }

        System.out.println(biggestKeg);
    }
}
