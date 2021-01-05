import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isBetween = checkIfIsBetween(password);
        boolean consists = checkIfConsists(password);
        boolean haveTwoDigits = checkIfHaveTwoDigits(password);
        if (isBetween && consists && haveTwoDigits){
            System.out.println("Password is valid");
        }
        if (!isBetween){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consists){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!haveTwoDigits){
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean checkIfHaveTwoDigits(String password) {
        int countDigits = 0;
        for (int i = 0; i < password.length() ; i++) {
            char symbol = password.charAt(i);
            boolean isDigit = Character.isDigit(symbol);
            if (isDigit){
                countDigits++;
            }
        }
        if (countDigits >= 2){
            return true;
        }
        return false;
    }

    private static boolean checkIfConsists(String password) {
        for (int i = 0; i < password.length() ; i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);
            if (!isLetter && !isDigit){
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfIsBetween(String password) {
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        }
        return false;
    }
}
