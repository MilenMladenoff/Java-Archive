package ArraysLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (int i = 0; i < arr.length; i++) {
            String numberInString = arr[i] + "";
            int indexOfDecimalPoint = numberInString.indexOf(".");
            double afterDecimalPoint = Double.parseDouble("0." + numberInString.substring(indexOfDecimalPoint + 1));
            int roundedNum = 0;

            if (afterDecimalPoint == 0.5 && arr[i] < 0) {
                roundedNum = (int) Math.floor(arr[i]);
            } else if (afterDecimalPoint == 0.5 && arr[i] >= 0){
                roundedNum = (int) Math.ceil(arr[i]);
            } else {
                roundedNum = (int) Math.round(arr[i]);
            }

            DecimalFormat decimalFormat = new DecimalFormat("0.###################");
            String formattedElement = decimalFormat.format(arr[i]);
            System.out.printf("%s => %d%n", formattedElement, roundedNum);
        }
    }
}
