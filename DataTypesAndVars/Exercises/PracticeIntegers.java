package DataTypesAndVars.Exercises;

import java.util.Scanner;

public class PracticeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.isEmpty()) {

            if (input.length() <= 2) {
                byte number = Byte.parseByte(input);
                System.out.println(number);
            } else if (input.length() <= 4) {
                short number = Short.parseShort(input);
                System.out.println(number);
            } else if (input.length() <= 9) {
                int number = Integer.parseInt(input);
                System.out.println(number);
            } else {
                long number = Long.parseLong(input);
                System.out.println(number);
            }

            input = scan.nextLine();
        }
    }
}
