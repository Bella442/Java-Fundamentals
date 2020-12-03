import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecial = false;
        int digit = 0;
        for (int i = 1; i <= n; i++) {
            int currentDigit = i;
            digit = i;
            int sumOfDigits = 0;
            while (currentDigit > 0) {
                sumOfDigits += currentDigit % 10;
                currentDigit = currentDigit / 10;
            }
            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                isSpecial = true;
            } else {
                isSpecial = false;
            }
            if (isSpecial && digit > 0) {
                System.out.printf("%d -> True%n", digit);
            } else if (!isSpecial && digit > 0){
                System.out.printf("%d -> False%n", digit);
            }
            digit = 0;
        }
    }
}
