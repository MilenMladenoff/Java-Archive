package Methods.Exercises;

import java.util.Scanner;

public class NumbersInReversedOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        printNumberReversed(number);
    }

    private static void printNumberReversed(String number) {

        for (int i = number.length() - 1; i >= 0; i--) {
            char symbol = number.charAt(i);
            System.out.print(symbol);
        }
    }
}
