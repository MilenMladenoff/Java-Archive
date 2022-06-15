package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char delimiter = scan.nextLine().charAt(0);
        String oddOrEven = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String inputLine = scan.nextLine();

            if (oddOrEven.equals("odd") && i % 2 != 0) {

                if (output.toString().equals("")) {
                    output.append(inputLine);
                } else {
                    output.append(delimiter).append(inputLine);
                }

            } else if (oddOrEven.equals("even") && i % 2 == 0) {

                if (output.toString().equals("")) {
                    output.append(inputLine);
                } else {
                    output.append(delimiter).append(inputLine);
                }
            }
        }

        System.out.println(output);
    }
}
