package Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        switch (type) {
            case "int":
                int n1 = Integer.parseInt(scan.nextLine());
                int n2 = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(n1, n2));
                break;
            case "char":
                char char1 = scan.nextLine().charAt(0);
                char char2 = scan.nextLine().charAt(0);
                System.out.println(getMax(char1, char2));
                break;
            case "string":
                String text1 = scan.nextLine();
                String text2 = scan.nextLine();
                System.out.println(getMax(text1, text2));
                break;
        }
    }

    private static int getMax(int n1, int n2) {
        return Integer.max(n1, n2);
    }

    private static char getMax(char char1, char char2) {

        if (char1 > char2) {
            return char1;
        } else {
            return char2;
        }
    }

    private static String getMax(String text1, String text2) {

        if (text1.compareTo(text2) >= 0) {
            return text1;
        } else {
            return text2;
        }
    }
}
