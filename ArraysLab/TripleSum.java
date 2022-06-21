package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class TripleSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                long sum = numbers[i] + numbers[j];

                for (int k = 0; k < numbers.length; k++) {

                    if (sum == numbers[k]) {
                        System.out.printf("%d + %d == %d%n", numbers[i], numbers[j], numbers[k]);
                        isFound = true;
                        break;
                    }
                }
            }
        }

        if (!isFound) {
            System.out.println("No");
        }
    }
}
