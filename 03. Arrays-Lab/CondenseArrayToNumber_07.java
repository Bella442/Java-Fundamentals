import java.util.ArrayList;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbersAsString = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersAsString.length];
            for (int i = 0; i < numbersAsString.length; i++) {
                numbers[i] = Integer.parseInt(numbersAsString[i]);
            }
            while (numbers.length > 1) {
                int[] condensed = new int[numbers.length - 1];
                for (int i = 0; i < condensed.length; i++) {
                    condensed[i] = numbers[i] + numbers[i + 1];
                }
                numbers = condensed;
            }
            System.out.println(numbers[0]);
    }
}
