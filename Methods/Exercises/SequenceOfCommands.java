package Methods.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SequenceOfCommands {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Long> sequence = Arrays.stream(scan.nextLine().split(" "))
                .map(Long::parseLong).collect(Collectors.toList());

        String commandLine = scan.nextLine();

        while (!commandLine.equals("stop")) {
            String[] command = commandLine.split(" ");

            switch (command[0]) {
                case "multiply":
                    int index = Integer.parseInt(command[1]) - 1;
                    int value = Integer.parseInt(command[2]);
                    sequence.set(index, sequence.get(index) * value);
                    break;
                case "add":
                    index = Integer.parseInt(command[1]) - 1;
                    value = Integer.parseInt(command[2]);
                    sequence.set(index, sequence.get(index) + value);
                    break;
                case "subtract":
                    index = Integer.parseInt(command[1]) - 1;
                    value = Integer.parseInt(command[2]);
                    sequence.set(index, sequence.get(index) - value);
                    break;
                case "lshift":
                    long number = sequence.get(0);
                    sequence.remove(0);
                    sequence.add(number);
                    break;
                case "rshift":
                    number = sequence.get(sequence.size() - 1);
                    sequence.remove(sequence.size() - 1);
                    sequence.add(0, number);
                    break;
            }

            System.out.println(sequence.toString().replaceAll("[\\[\\],]", ""));
            commandLine = scan.nextLine();
        }
    }
}
