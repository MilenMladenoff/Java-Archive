package Exam10012019Part1;

import java.util.Scanner;

public class SantasCookies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int singleCookieGrams = 25;
        int cup = 140;
        int smallSpoon = 10;
        int bigSpoon = 20;
        int cookiesPerBox = 5;
        int totalBoxes = 0;

        for (int i = 1; i <= n; i++) {
            int flour = Integer.parseInt(scan.nextLine());
            int sugar = Integer.parseInt(scan.nextLine());
            int cocoa = Integer.parseInt(scan.nextLine());
            int flourCups = flour / cup;
            int sugarSpoons = sugar / bigSpoon;
            int cocoaSpoons = cocoa / smallSpoon;
            int cookiesPerBake = (cup + smallSpoon + bigSpoon) * Integer.min(flourCups, Integer.min(sugarSpoons, cocoaSpoons)) / singleCookieGrams;
            int boxesPerBake = cookiesPerBake / cookiesPerBox;

            if (boxesPerBake <= 0) {
                System.out.println("Ingredients are not enough for a box of cookies.");
            } else {
                totalBoxes += boxesPerBake;
                System.out.printf("Boxes of cookies: %d%n", boxesPerBake);
            }
        }

        System.out.printf("Total boxes: %d", totalBoxes);
    }
}
