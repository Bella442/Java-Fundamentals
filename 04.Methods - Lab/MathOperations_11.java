import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());
        double result = calculate(firstNum,operator,secondNum);
        System.out.println(new DecimalFormat("0.###").format(result));
    }

    private static double calculate(int a, char operator, int b) {
        double result = 0.0;
        switch (operator){
            case '/':
                result = a / (b * 1.0);
                break;
            case '*':
                result = a * (b * 1.0);
                break;
            case '+':
                result = a + (b * 1.0);
                break;
            case '-':
                result = a - (b * 1.0);
                break;
        }
        return result;
    }
}
