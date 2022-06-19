package Methods.Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        BigInteger factorial = new BigInteger(String.valueOf(1));

        calculateFactorial(n, factorial);
    }

    private static void calculateFactorial(int n, BigInteger factorial) {

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        countTrailingZeroes(factorial);
    }

    private static void countTrailingZeroes(BigInteger factorial) {
        String factorialToString = factorial.toString();
        int zeroesCounter = 0;

        for (int i = factorialToString.length() - 1; i >= 0; i--) {
            char digit = factorialToString.charAt(i);

            if (digit == '0') {
                zeroesCounter++;
            } else {
                break;
            }
        }

        System.out.println(zeroesCounter);
    }
}
