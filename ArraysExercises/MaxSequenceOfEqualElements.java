package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sequenceCounter = 1;
        int maxSequence = 1;
        int longestSequenceNumber = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] == numbers[i - 1]) {
                sequenceCounter++;

                if (sequenceCounter > maxSequence) {
                    maxSequence = sequenceCounter;
                    longestSequenceNumber = numbers[i];
                }

            } else {
                sequenceCounter = 1;
            }
        }

        for (int i = 1; i <= maxSequence; i++) {
            System.out.print(longestSequenceNumber + " ");
        }
    }
}
