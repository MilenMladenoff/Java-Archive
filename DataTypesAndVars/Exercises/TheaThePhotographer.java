package DataTypesAndVars.Exercises;

import java.util.Scanner;

public class TheaThePhotographer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int allPictures = Integer.parseInt(scan.nextLine());
        int filterTimePerPicture = Integer.parseInt(scan.nextLine());
        int filterFactor = Integer.parseInt(scan.nextLine());
        int uploadTimePerPicture = Integer.parseInt(scan.nextLine());

        int filterTime = allPictures * filterTimePerPicture;
        int filteredPictures = (int) Math.ceil(allPictures * (filterFactor * 1.0 / 100));
        int uploadTime = filteredPictures * uploadTimePerPicture;
        int totalTime = filterTime + uploadTime;

        int seconds = totalTime % 60;
        String displaySeconds = "";

        if (seconds < 10) {
            displaySeconds = "0" + seconds;
        } else {
            displaySeconds = String.valueOf(seconds);
        }

        int minutes = totalTime / 60;
        int minutesToDisplay = minutes % 60;
        String displayMinutes = "";

        if (minutesToDisplay < 10) {
            displayMinutes = "0" + minutesToDisplay;
        } else {
            displayMinutes = String.valueOf(minutesToDisplay);
        }

        int hours = minutes / 60;
        int hoursToDisplay = hours % 24;
        String displayHours = "";

        if (hoursToDisplay < 10) {
            displayHours = "0" + hoursToDisplay;
        } else {
            displayHours = String.valueOf(hoursToDisplay);
        }

        int days = hours / 24;
        System.out.printf("%d:%s:%s:%s", days, displayHours, displayMinutes, displaySeconds);
    }
}