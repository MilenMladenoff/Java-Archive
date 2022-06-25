package ArraysExercises;

import java.util.*;
import java.util.stream.Collectors;

public class LargestCommonEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> arr1 = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<String> arr2 = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<String> biggerArr;
        List<String> smallerArr;

        if (arr1.size() >= arr2.size()) {
            biggerArr = arr1;
            smallerArr = arr2;
        } else {
            biggerArr = arr2;
            smallerArr = arr1;
        }

        int arraysSizeDiff = biggerArr.size() - smallerArr.size();
        int rightCommonEnd = getArraysCommonEnd(biggerArr, smallerArr, arraysSizeDiff);
        Collections.reverse(biggerArr);
        Collections.reverse(smallerArr);
        int leftCommonEnd = getArraysCommonEnd(biggerArr, smallerArr, arraysSizeDiff);

        System.out.println(Math.max(rightCommonEnd, leftCommonEnd));
    }

    private static int getArraysCommonEnd(List<String> biggerArr, List<String> smallerArr, int arraysSizeDiff) {
        int equalsCounter = 0;

        for (int i = 0; i < smallerArr.size(); i++) {

            for (int j = i + arraysSizeDiff; j < biggerArr.size(); j++) {

                if (smallerArr.get(i).equals(biggerArr.get(j))) {
                    equalsCounter++;
                    break;
                } else {
                    equalsCounter = 0;
                }
            }
        }

        return equalsCounter;
    }
}