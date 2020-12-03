import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        int currentNumber = 0;
        boolean isSpecial = false;
        for (int i = 1; i <= counter; i++) {
            currentNumber = i;
            while (i > 0) {
                sumOfDigits += i % 10;
                i = i / 10;
            }
            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11){
                isSpecial = true;
                System.out.printf("%d -> True%n", currentNumber);
            }else{
                System.out.printf("%d -> False%n", currentNumber);
            }
            sumOfDigits = 0;
            i = currentNumber;
        }
    }
}
