package Methods.Exercises;

import java.util.Scanner;

public class MaxMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int maxNum = getMax(a, getMax(b, c));
        System.out.println(maxNum);
    }

    private static int getMax(int a, int b) {
        return Math.max(a, b);
    }
}
