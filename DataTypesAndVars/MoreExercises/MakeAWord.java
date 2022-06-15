package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class MakeAWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        System.out.print("The word is: ");

        for (int i = 1; i <= n; i++) {
            char letter = scan.nextLine().charAt(0);
            System.out.print(letter);
        }
    }
}
