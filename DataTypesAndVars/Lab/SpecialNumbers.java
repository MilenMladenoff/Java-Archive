package DataTypesAndVars.Lab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            int currentNumber = i;
            int digitsSum = 0;

            while (currentNumber >= 1) {
                int digit = currentNumber % 10;
                digitsSum += digit;
                currentNumber /= 10;
            }

            if (digitsSum == 5 || digitsSum == 7 || digitsSum == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
