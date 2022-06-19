package Methods.Exercises;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = Long.parseLong(scan.nextLine());

        if (number <= 1) {
            System.out.println("False");
            return;
        }

        if (isPrime(number)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean isPrime(long number) {
        boolean isPrime = true;

        for (long i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
