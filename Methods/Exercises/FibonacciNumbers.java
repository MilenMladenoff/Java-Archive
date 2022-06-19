package Methods.Exercises;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int first = 1;
        int second = 1;

        calculateFibonacciNumber(n, first, second);
    }

    private static void calculateFibonacciNumber(int n, int first, int second) {

        for (int i = 0; i < n - 1; i++) {
            int third = first + second;
            first = second;
            second = third;
        }

        System.out.println(second);
    }
}
