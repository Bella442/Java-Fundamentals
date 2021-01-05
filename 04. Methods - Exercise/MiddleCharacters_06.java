import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        findMiddleCharacter(input);
    }

    private static void findMiddleCharacter(String input) {
        int stringMiddle = input.length() / 2;
        char middleChar = input.charAt(stringMiddle);
        if (input.length() % 2 == 0) {
            char secondMiddle = input.charAt(stringMiddle - 1);
            System.out.printf("%c%c", secondMiddle, middleChar);
        } else {
            System.out.println(middleChar);
        }
    }
}
