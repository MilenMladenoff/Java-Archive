package DataTypesAndVars.Exercises;

import java.util.Scanner;

public class VariableInHexFormat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String hex = input.substring(2);
        int decimalNumber = Integer.parseInt(hex, 16);
        System.out.println(decimalNumber);
    }
}
