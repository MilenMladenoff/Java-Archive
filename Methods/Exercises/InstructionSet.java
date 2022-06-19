package Methods.Exercises;

import java.util.Scanner;

public class InstructionSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (!input.equals("END")) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "INC":
                    long operand1 = Long.parseLong(command[1]);
                    operand1++;
                    System.out.println(operand1);
                    break;
                case "DEC":
                    operand1 = Long.parseLong(command[1]);
                    operand1--;
                    System.out.println(operand1);
                    break;
                case "ADD":
                    operand1 = Long.parseLong(command[1]);
                    long operand2 = Long.parseLong(command[2]);
                    System.out.println(operand1 + operand2);
                    break;
                case "MLA":
                    operand1 = Long.parseLong(command[1]);
                    operand2 = Long.parseLong(command[2]);
                    System.out.println(operand1 * operand2);
                    break;
            }

            input = scan.nextLine();
        }
    }
}
