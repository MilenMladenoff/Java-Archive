package Exam10012019Part2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SantasNewList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> children = new TreeMap<>();
        Map<String, Integer> presents = new LinkedHashMap<>();
        String inputLine = scan.nextLine();

        while (!inputLine.equals("END")) {
            String[] command = inputLine.split("->");

            if (!command[0].equals("Remove")) {
                String childName = command[0];
                String present = command[1];
                int amount = Integer.parseInt(command[2]);

                if (!children.containsKey(childName)) {
                    children.put(childName, amount);
                } else {
                    children.replace(childName, children.get(childName) + amount);
                }

                if (!presents.containsKey(present)) {
                    presents.put(present, amount);
                } else {
                    presents.replace(present, presents.get(present) + amount);
                }

            } else {
                String childToRemove = command[1];
                children.remove(childToRemove);
            }

            inputLine = scan.nextLine();
        }

        System.out.println("Children:");
        children.entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(k -> System.out.printf("%s -> %d%n", k.getKey(), k.getValue()));
        System.out.println("Presents:");
        presents.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));

    }
}
