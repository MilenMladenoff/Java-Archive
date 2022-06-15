package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class CatchTheThief {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String numeralType = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        long thiefID = Long.MIN_VALUE;
        long numberLimit = 0;

        switch (numeralType) {
            case "sbyte":
                numberLimit = Byte.MAX_VALUE;
                break;
            case "int":
                numberLimit = Integer.MAX_VALUE;
                break;
            default:
                numberLimit = Long.MAX_VALUE;
        }

        for (int i = 1; i <= n; i++) {
            long currentID = Long.parseLong(scan.nextLine());

            if (currentID > thiefID && currentID <= numberLimit) {
                thiefID = currentID;
            }
        }

        System.out.println(thiefID);
    }
}
