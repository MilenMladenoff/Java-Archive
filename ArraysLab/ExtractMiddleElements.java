package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractMiddleElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (arr.length == 1) {
            System.out.printf("{ %d }", arr[0]);
        } else if (arr.length > 1 && arr.length % 2 == 0) {
            System.out.printf("{ %d, %d }", arr[arr.length / 2 - 1], arr[arr.length / 2]);
        } else if (arr.length > 1 && arr.length % 2 != 0) {
            System.out.printf("{ %d, %d, %d }", arr[arr.length / 2 - 1], arr[arr.length / 2], arr[arr.length / 2 + 1]);
        }
    }
}
