package DataTypesAndVars.Exercises;

import java.util.Scanner;

public class PracticeCharsAndStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.isEmpty()) {

            if (input.length() == 1) {
                char symbol = input.charAt(0);
                System.out.println(symbol);
            } else {
                System.out.println(input);
            }

            input = scan.nextLine();
        }
    }
}
