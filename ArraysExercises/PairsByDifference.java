package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class PairsByDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scan.nextLine());

        int pairsCounter = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                if (Math.abs(numbers[i] - numbers[j]) == n) {
                    pairsCounter++;
                }
            }
        }

        System.out.println(pairsCounter);
    }
}
