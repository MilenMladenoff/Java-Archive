package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int frequencyCount = 0;
        int maxFrequency = 0;
        int maxFrequent = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    frequencyCount++;
                }

                if (frequencyCount > maxFrequency) {
                    maxFrequency = frequencyCount;
                    maxFrequent = numbers[i];
                }
            }

            frequencyCount = 0;
        }

        if (maxFrequency == 0) {
            maxFrequent = numbers[0];
        }

        System.out.println(maxFrequent);
    }
}
