package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] biggerArr;
        int[] smallerArr;

        if (arr1.length >= arr2.length) {
            biggerArr = arr1;
            smallerArr = arr2;
        } else {
            biggerArr = arr2;
            smallerArr = arr1;
        }

        int smallerArrCounter = 0;

        for (int i = 0; i < biggerArr.length; i++) {
            int sum = biggerArr[i] + smallerArr[smallerArrCounter];
            System.out.print(sum + " ");

            if (smallerArrCounter == smallerArr.length - 1) {
                smallerArrCounter = 0;
            } else {
                smallerArrCounter++;
            }
        }
    }
}
