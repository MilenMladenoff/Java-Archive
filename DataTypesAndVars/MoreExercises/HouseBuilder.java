package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class HouseBuilder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price1 = Integer.parseInt(scan.nextLine());
        int price2 = Integer.parseInt(scan.nextLine());

        long totalPrice = Math.max(price1, price2) * 10L + Math.min(price1, price2) * 4;
        System.out.println(totalPrice);
    }
}
