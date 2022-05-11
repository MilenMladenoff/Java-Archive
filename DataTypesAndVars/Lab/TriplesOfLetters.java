package DataTypesAndVars.Lab;

import java.util.Scanner;

public class TriplesOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int start = 97;
        int end = 96 + n;

        for (int i = start; i <= end; i++) {

            for (int j = start; j <= end; j++) {

                for (int k = start; k <= end; k++) {
                    System.out.printf("%c%c%c%n", (char) i, (char) j, (char) k);
                }
            }
        }
    }
}
