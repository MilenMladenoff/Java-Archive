package ArraysExercises;

import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.printf("%s -> %d%n", input.charAt(i), (int) input.charAt(i) - 97);
        }
    }
}
