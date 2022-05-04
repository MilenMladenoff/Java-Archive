package Exam10012019Part2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int key = Integer.parseInt(scan.nextLine());
        String inputLine = scan.nextLine();

        while (!inputLine.equals("end")){
            StringBuilder decodedLine = new StringBuilder();

            for (int i = 0; i < inputLine.length(); i++) {
                char currentChar = inputLine.charAt(i);
                currentChar -= key;
                decodedLine.append(currentChar);
            }

            String regex = "@(?<name>[A-Za-z]+)[^-@!:>]+!(?<behavior>[GN])!";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decodedLine);

            if (matcher.find()){

                if (matcher.group("behavior").equals("G")){
                    System.out.println(matcher.group("name"));
                }
            }

            inputLine = scan.nextLine();
        }
    }
}
