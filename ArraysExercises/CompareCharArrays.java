package ArraysExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> arr1 = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<String> arr2 = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        boolean arr1IsFirst = true;

        if (arr1.size() > arr2.size()) {
            arr1IsFirst = false;
        } else if (arr1.size() < arr2.size()) {
            arr1IsFirst = true;
        } else {

            for (int i = 0; i < arr1.size(); i++) {

                if (arr1.get(i).charAt(0) < arr2.get(i).charAt(0)) {
                    arr1IsFirst = true;
                    break;
                } else if (arr1.get(i).charAt(0) > arr2.get(i).charAt(0)) {
                    arr1IsFirst = false;
                    break;
                }
            }
        }

        if (arr1IsFirst) {
            System.out.println(String.join("", arr1));
            System.out.println(String.join("", arr2));
        } else {
            System.out.println(String.join("", arr2));
            System.out.println(String.join("", arr1));
        }
    }
}
