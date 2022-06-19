package Methods.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimesInGivenRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = Integer.parseInt(scan.nextLine());

        if (start <= 1) {
            start = 2;
        }

        int end = Integer.parseInt(scan.nextLine());

        List<Integer> primeNumbers = calculatePrimesInRange(start, end);

        printAllPrimesInRange(primeNumbers);
    }

    private static void printAllPrimesInRange(List<Integer> primeNumbers) {

        for (int i = 0; i < primeNumbers.size(); i++) {

            if (i < primeNumbers.size() - 1) {
                System.out.printf("%d, ", primeNumbers.get(i));
            } else {
                System.out.println(primeNumbers.get(i));
            }
        }
    }

    private static List<Integer> calculatePrimesInRange(int start, int end) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }
}
