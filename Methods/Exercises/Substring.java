package Methods.Exercises;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        findAndPrintPAndCountLetters(text, count);
    }

    private static void findAndPrintPAndCountLetters(String text, int count) {

        if (text.contains("p")) {

            while (text.contains("p")) {
                StringBuilder pAndCountLetters = new StringBuilder();

                for (int i = text.indexOf("p"); i <= text.indexOf("p") + count; i++) {
                    char letter = text.charAt(i);
                    System.out.print(letter);
                    pAndCountLetters.append(letter);

                    if (i == text.length() - 1) {
                        break;
                    }
                }

                System.out.println();
                text = text.replaceFirst(pAndCountLetters.toString(), "");
            }

        } else {
            System.out.println("no");
        }
    }
}
