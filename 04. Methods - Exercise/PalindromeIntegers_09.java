import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            boolean isPalindrome = checkIfIntegersArePalindrome(input);
            if (isPalindrome){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }
    private static boolean checkIfIntegersArePalindrome(String input){
        String[] number = input.split("");
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            String current = number[i];
            reversed += current;
        }
        if (reversed.equals(input)) {
           return true;
        }
        return false;
    }
}
