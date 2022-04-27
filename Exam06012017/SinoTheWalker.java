package Exam06012017;

import java.util.Scanner;

public class SinoTheWalker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] startTime = scan.nextLine().split(":");
        int startHours = Integer.parseInt(startTime[0]);
        int startMinutes = Integer.parseInt(startTime[1]);
        int startSeconds = Integer.parseInt(startTime[2]);
        int startInSeconds = startHours * 60 * 60 + startMinutes * 60 + startSeconds;
        int steps = Integer.parseInt(scan.nextLine()) % 86400;
        int secondsPerStep = Integer.parseInt(scan.nextLine()) % 86400;
        int walkingInSeconds = steps * secondsPerStep;
        int endInSeconds = startInSeconds + walkingInSeconds;
        int endHours = (endInSeconds / 60 / 60) % 24;
        int endMinutes = (endInSeconds / 60) % 60;
        int endSeconds = endInSeconds % 60;
        String hours = String.format("%02d", endHours);
        String minutes = String.format("%02d", endMinutes);
        String seconds = String.format("%02d", endSeconds);
        System.out.printf("Time Arrival: %s:%s:%s", hours, minutes, seconds);
    }
}
