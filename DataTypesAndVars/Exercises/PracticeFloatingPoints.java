package DataTypesAndVars.Exercises;

import java.math.BigDecimal;
import java.util.Scanner;

public class PracticeFloatingPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.isEmpty()) {

            if (input.length() <= 9) {
                float number = Float.parseFloat(input);
                System.out.println(number);
            } else if (input.length() <= 17) {
                double number = Double.parseDouble(input);
                System.out.println(number);
            } else {
                BigDecimal number = new BigDecimal(input);
                System.out.println(number);
            }

            input = scan.nextLine();
        }
    }
}
