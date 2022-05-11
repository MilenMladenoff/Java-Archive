package DataTypesAndVars.Lab;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        System.out.printf("Hello, %s %s. You are %d years old.", firstName, lastName, age);
    }
}
