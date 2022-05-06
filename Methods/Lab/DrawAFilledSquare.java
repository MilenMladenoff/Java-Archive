package Methods.Lab;

import java.util.Scanner;

public class DrawAFilledSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        printStraightRow(n);

        for (int i = 1; i <= n - 2; i++) {
            printMiddleRow(n);
        }

        printStraightRow(n);
    }

    private static void printMiddleRow(int n) {
        System.out.print("-");

        for (int i = 1; i < n; i++) {
            System.out.print("\\/");
        }

        System.out.println("-");
    }

    private static void printStraightRow(int n) {

        for (int i = 1; i <= n * 2; i++) {
            System.out.print("-");
        }

        System.out.println();
    }
}
