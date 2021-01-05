import javax.swing.*;
import java.util.Scanner;

public class SignOfIntegerNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        signOfInteger(Integer.parseInt(scanner.nextLine()));
    }
    static void signOfInteger(int number) {
        if (number > 0 ){
            System.out.printf("The number %d is positive.",number);
        }else if (number < 0){
            System.out.printf("The number %d is negative.",number);
        }else if (number == 0){
            System.out.printf("The number 0 is zero.");
        }
    }
}
