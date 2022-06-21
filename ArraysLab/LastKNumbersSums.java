package ArraysLab;

import java.util.Scanner;

public class LastKNumbersSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int k = Integer.parseInt(scan.nextLine());
        long[] arr = new long[n];
        arr[0] = 1;

        for (int i = 1; i < n; i++) {
            long sum = 0;

            for (int j = i; j >= i - k; j--) {
                sum += arr[j];

                if (j == 0) {
                    break;
                }
            }

            arr[i] = sum;
        }

        for (long i : arr) {
            System.out.print(i + " ");
        }
    }
}
