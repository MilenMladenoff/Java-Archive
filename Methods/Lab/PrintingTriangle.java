package Methods.Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            printLine(i);
        }

        printLine(n);

        for (int i = n - 1; i >= 0; i--) {
            printLine(i);
        }
    }

    private static void printLine(int end) {

        for (int i = 1; i <= end; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
