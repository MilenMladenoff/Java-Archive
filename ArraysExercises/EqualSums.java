package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (numbers.length == 1) {
            System.out.println("0");
        } else if (numbers.length == 2) {
            System.out.println("no");
        } else {
            boolean isEqual = false;

            for (int i = 0; i < numbers.length; i++) {
                long leftSum = 0;
                long rightSum = 0;

                for (int leftIndex = 0; leftIndex < i; leftIndex++) {
                    leftSum += numbers[leftIndex];
                }

                for (int rightIndex = i + 1; rightIndex < numbers.length; rightIndex++) {
                    rightSum += numbers[rightIndex];
                }

                if (leftSum == rightSum) {
                    System.out.println(i);
                    isEqual = true;
                    break;
                }
            }

            if (!isEqual) {
                System.out.println("no");
            }
        }
    }
}
