package DataTypesAndVars.Exercises;

import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input = input.toLowerCase();
        char symbol = input.charAt(0);

        if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
            System.out.println("vowel");
        } else if (symbol >= 48 && 57 >= symbol) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}
