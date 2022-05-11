package DataTypesAndVars.Lab;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int persons = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        double courses = Math.ceil(persons * 1.0 / capacity);
        System.out.printf("%.0f", courses);
    }
}
