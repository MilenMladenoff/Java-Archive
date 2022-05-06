package Methods.Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scan.nextLine()));
        int result = getEvensSum(number) * getOddsSum(number);
        System.out.println(result);
    }

    private static int getEvensSum(int number) {
        int evensSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                evensSum += lastDigit;
            }

            number /= 10;
        }

        return evensSum;

    }

    private static int getOddsSum(int number) {
        int oddsSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 != 0) {
                oddsSum += lastDigit;
            }

            number /= 10;
        }

        return oddsSum;
    }
}
