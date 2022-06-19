package Methods.Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
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

        System.out.println(factorial);
    }
}
