package DataTypesAndVars.MoreExercises;

import java.util.Scanner;

public class SentenceTheThief {
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

        double sentence = 0;

        if (thiefID > 0) {
            sentence = thiefID * 1.0 / 127;
        } else if (thiefID < 0) {
            sentence = Math.abs(thiefID * 1.0 / -128);
        }

        sentence = Math.ceil(sentence);

        if (sentence == 1) {
            System.out.printf("Prisoner with id %d is sentenced to %.0f year", thiefID, sentence);
        } else {
            System.out.printf("Prisoner with id %d is sentenced to %.0f years", thiefID, sentence);
        }
    }
}
