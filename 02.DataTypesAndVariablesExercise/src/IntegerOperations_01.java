import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = Integer.parseInt(scanner.nextLine());
        int secondDigit = Integer.parseInt(scanner.nextLine());
        int thirdDigit = Integer.parseInt(scanner.nextLine());
        int fourthDigit = Integer.parseInt(scanner.nextLine());
        int result = ((firstDigit + secondDigit) / thirdDigit) * fourthDigit;
        System.out.println(result);
    }
}
