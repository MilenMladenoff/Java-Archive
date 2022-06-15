package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        if (number.contains(".")) {
            System.out.println("floating-point");
        } else {
            System.out.println("integer");
        }
    }
}
