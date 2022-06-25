package ArraysExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RotateAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> inputArr = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> elementsSums = new ArrayList<>(inputArr.size());
        int k = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= k; i++) {
            int elementToMove = inputArr.get(inputArr.size() - 1);
            inputArr.add(0, elementToMove);
            inputArr.remove(inputArr.size() - 1);

            if (i == 1) {

                for (int j = 0; j < inputArr.size(); j++) {
                    elementsSums.add(j, inputArr.get(j));
                }

            } else {

                for (int j = 0; j < inputArr.size(); j++) {
                    elementsSums.set(j, elementsSums.get(j) + inputArr.get(j));
                }
            }
        }

        System.out.println(elementsSums.toString().replaceAll("[\\[\\],]", ""));
    }
}