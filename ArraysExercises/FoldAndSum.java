package ArraysExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FoldAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> arr = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int k = arr.size() / 4;
        int leftPosition = k;
        int rightPosition = k * 4;

        for (int i = k; i < k * 3; i++) {

            if (i < arr.size() / 2) {
                leftPosition--;
                arr.set(i, arr.get(i) + arr.get(leftPosition));
            } else {
                rightPosition--;
                arr.set(i, arr.get(i) + arr.get(rightPosition));
            }

            System.out.print(arr.get(i) + " ");
        }
    }
}
