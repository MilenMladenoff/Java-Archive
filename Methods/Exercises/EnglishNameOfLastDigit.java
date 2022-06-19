package Methods.Exercises;

import java.util.Scanner;

public class EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = Long.parseLong(scan.nextLine());

        String lastDigitName = getLastDigitName(number);
        System.out.println(lastDigitName);
    }

    private static String getLastDigitName(long number) {
        int lastDigit = (int) Math.abs(number % 10);
        String digitName = "";

        switch (lastDigit) {
            case 0:
                digitName = "zero";
                break;
            case 1:
                digitName = "one";
                break;
            case 2:
                digitName = "two";
                break;
            case 3:
                digitName = "three";
                break;
            case 4:
                digitName = "four";
                break;
            case 5:
                digitName = "five";
                break;
            case 6:
                digitName = "six";
                break;
            case 7:
                digitName = "seven";
                break;
            case 8:
                digitName = "eight";
                break;
            case 9:
                digitName = "nine";
                break;
        }

        return digitName;
    }
}
