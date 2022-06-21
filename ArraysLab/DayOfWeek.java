package ArraysLab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] daysOfTheWeek = new String[]
                {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int dayNumber = Integer.parseInt(scan.nextLine());

        switch (dayNumber) {
            case 1:
                System.out.println(daysOfTheWeek[0]);
                break;
            case 2:
                System.out.println(daysOfTheWeek[1]);
                break;
            case 3:
                System.out.println(daysOfTheWeek[2]);
                break;
            case 4:
                System.out.println(daysOfTheWeek[3]);
                break;
            case 5:
                System.out.println(daysOfTheWeek[4]);
                break;
            case 6:
                System.out.println(daysOfTheWeek[5]);
                break;
            case 7:
                System.out.println(daysOfTheWeek[6]);
                break;
            default:
                System.out.println("Invalid Day!");
        }
    }
}
