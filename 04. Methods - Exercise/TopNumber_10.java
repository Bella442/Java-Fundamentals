import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        findTopNumbers(n);

    }
    private static void findTopNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int sumOfDigits = 0;
            int sumOddDigits = 0;
            if (currentNum >= 10) {
                while (currentNum > 0) {
                    int currentDigit = currentNum % 10;
                    sumOfDigits += currentDigit;
                    if (currentDigit % 2 != 0) {
                        sumOddDigits++;
                    }
                    currentNum /= 10;
                }
            }
            currentNum = i;
            if (sumOfDigits % 8 == 0 && sumOddDigits > 0) {
                System.out.println(currentNum);
            }
        }
    }
}