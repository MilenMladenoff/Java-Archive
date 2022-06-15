package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class BoatSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char firstBoat = scan.nextLine().charAt(0);
        char secondBoat = scan.nextLine().charAt(0);
        int n = Integer.parseInt(scan.nextLine());
        int oddsSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            String inputLine = scan.nextLine();

            if (inputLine.equals("UPGRADE")) {
                firstBoat += 3;
                secondBoat += 3;
            } else {

                if (i % 2 != 0) {
                    oddsSum += inputLine.length();
                } else {
                    evenSum += inputLine.length();
                }
            }

            if (oddsSum >= 50 || evenSum >= 50) {
                break;
            }
        }

        if (oddsSum > evenSum) {
            System.out.println(firstBoat);
        } else {
            System.out.println(secondBoat);
        }

    }
}
