import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] array = scanner.nextLine().split(" ");
        int [] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array [i]);
        }
        int maxCount = 0;
        int digit = 0;
        int counter = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                counter++;
                if (counter > maxCount) {
                    maxCount = counter;
                    digit = numbers[i];
                }
            } else
                counter = 1;
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(digit + " ");
        }
    }
}
