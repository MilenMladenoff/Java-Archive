package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] inputArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (inputArr.length == 1) {
            System.out.printf("%d is already condensed to number", inputArr[0]);
            return;
        }

        for (int i = 0; i < inputArr.length - 1; i++) {

            for (int j = 0; j < inputArr.length - 1; j++) {
                inputArr[j] = inputArr[j] + inputArr[j + 1];
            }
        }

        System.out.println(inputArr[0]);
    }
}
