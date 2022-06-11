package DataTypesAndVars.Exercises;

import java.util.Scanner;

public class CenturiesToNanoseconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int centuries = Integer.parseInt(scan.nextLine());
        int years = centuries * 100;
        double days = Math.floor(years * 365.2422);
        int hours = (int) (days * 24);
        long minutes = hours * 60L;
        long seconds = minutes * 60;
        long milliseconds = seconds * 1000;
        long microseconds = milliseconds * 1000;
        String nanoseconds = microseconds + "000";

        System.out.printf("%d centuries = %d years = %.0f days = %d hours = %d minutes = %d seconds = " +
                        "%d milliseconds = %d microseconds = %s nanoseconds",
                centuries, years, days, hours, minutes, seconds, milliseconds, microseconds, nanoseconds);
    }
}
