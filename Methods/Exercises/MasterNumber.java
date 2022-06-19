package Methods.Exercises;

import java.util.Scanner;

public class MasterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 161; i <= n; i++) {

            if (isPalindrome(i) && sumOfDigits(i) % 7 == 0 && containsEvenDigits(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean containsEvenDigits(int i) {
        boolean containsEvenDigit = false;
        int currentNum = i;

        for (int j = 1; j <= currentNum; j++) {
            int digit = currentNum % 10;

            if (digit % 2 == 0) {
                containsEvenDigit = true;
                break;
            }

            currentNum /= 10;
        }

        return containsEvenDigit;
    }

    private static int sumOfDigits(int i) {
        int currentNum = i;
        int sum = 0;

        while (currentNum != 0) {
            int digit = currentNum % 10;
            sum += digit;
            currentNum /= 10;
        }

        return sum;
    }

    private static boolean isPalindrome(int i) {
        boolean isPalindrome = true;
        String iToString = i + "";

        for (int j = 0; j < iToString.length() / 2; j++) {

            if (iToString.charAt(j) != iToString.charAt(iToString.length() - 1 - j)) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
}
