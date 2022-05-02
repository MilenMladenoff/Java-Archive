package Exam10012019Part1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasGifts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Integer> houses = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int currentPosition = 0;

        for (int i = 1; i <= n; i++) {
            String[] command = scan.nextLine().split(" ");

            switch (command[0]) {
                case "Forward":
                    int steps = Integer.parseInt(command[1]);

                    if (0 <= currentPosition + steps && currentPosition + steps < houses.size()) {
                        currentPosition += steps;
                        houses.remove(currentPosition);
                    }

                    break;
                case "Back":
                    steps = Integer.parseInt(command[1]);

                    if (0 <= currentPosition - steps && currentPosition - steps < houses.size()) {
                        currentPosition -= steps;
                        houses.remove(currentPosition);
                    }

                    break;
                case "Gift":
                    int index = Integer.parseInt(command[1]);
                    int house = Integer.parseInt(command[2]);

                    if (0 <= index && index < houses.size()) {
                        currentPosition = index;
                        houses.add(index, house);
                    }

                    break;
                case "Swap":
                    int house1 = Integer.parseInt(command[1]);
                    int house2 = Integer.parseInt(command[2]);
                    int house1Index = houses.indexOf(house1);
                    int house2Index = houses.indexOf(house2);

                    if ((0 <= house1Index && house1Index < houses.size()) && (0 <= house2Index && house2Index < houses.size())) {
                        houses.set(house1Index, house2);
                        houses.set(house2Index, house1);
                    }

                    break;
            }
        }

        System.out.printf("Position: %d%n", currentPosition);

        for (int i = 0; i < houses.size(); i++) {
            System.out.print(houses.get(i));

            if (i < houses.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
