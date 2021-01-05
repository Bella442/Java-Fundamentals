import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(Integer.parseInt(scanner.nextLine()));
        int result = getMultipleOfEvensAndOdds(number);
        System.out.println(result);

    }
    static int getMultipleOfEvensAndOdds(int n){
        int evenSum = getSumOfEvenDigits(n);
        int oddSum = getSumOfOddDigits(n);
        return evenSum * oddSum;
    }

    private static int getSumOfOddDigits(int n) {
        int sumOdd = 0;
        while (n > 0) {
            int currentNum = 0;
            currentNum = n % 10;
            if (currentNum % 2 != 0) {
                sumOdd+= currentNum;
                n /= 10;
            } else {
                n /= 10;
            }
        }

        return sumOdd;
    }

    private static int getSumOfEvenDigits(int n) {
        int sumEven = 0;
        while (n > 0) {
            int currentNum = 0;
            currentNum = n % 10;
            if (currentNum % 2 == 0) {
                sumEven+= currentNum;
                n /= 10;
            } else {
                n /= 10;
            }
        }
        return sumEven;
    }
}
