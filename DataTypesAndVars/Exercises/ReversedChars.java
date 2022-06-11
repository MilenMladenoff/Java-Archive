package DataTypesAndVars.Exercises;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder letters = new StringBuilder();

        for (int i = 1; i <= 3; i++) {
            char currentLetter = scan.nextLine().charAt(0);
            letters.append(currentLetter);
        }

        letters.reverse();
        System.out.println(letters);
    }
}
