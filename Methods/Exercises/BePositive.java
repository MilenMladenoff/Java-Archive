package Methods.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BePositive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {
            List<Integer> sequence = Arrays.stream(scan.nextLine().trim().split("\\s+"))
                    .map(Integer::parseInt).collect(Collectors.toList());

            int outputNumbersCount = 0;

            for (int j = 0; j < sequence.size(); j++) {

                if (sequence.get(j) >= 0) {
                    System.out.printf("%d ", sequence.get(j));
                    outputNumbersCount++;
                } else {

                    if (j < sequence.size() - 1 && sequence.get(j) <= sequence.get(j + 1)
                            && (sequence.get(j) + sequence.get(j + 1)) >= 0) {

                        System.out.printf("%d ", sequence.get(j) + sequence.get(j + 1));
                        outputNumbersCount++;
                    }

                    j++;
                }
            }

            if (outputNumbersCount == 0) {
                System.out.print("(empty)");
            }

            System.out.println();
        }
    }
}
