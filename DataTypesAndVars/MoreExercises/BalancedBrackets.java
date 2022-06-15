package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        boolean isClosed = true;
        int openingBracketsCounter = 0;

        for (int i = 1; i <= n; i++) {
            String inputLine = scan.nextLine();

            if (inputLine.equals("(")) {
                isClosed = false;
                openingBracketsCounter++;
            } else if (inputLine.equals(")")) {

                if (isClosed) {
                    isClosed = false;
                    break;
                }

                isClosed = true;
                openingBracketsCounter = 0;
            }

            if (openingBracketsCounter >= 2) {
                isClosed = false;
                break;
            }
        }

        if (isClosed) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
