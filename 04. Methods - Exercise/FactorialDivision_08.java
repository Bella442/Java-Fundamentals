import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
       double result = (double)findFactorial(firstNum) / (double)findFactorial(secondNum);
        System.out.printf("%.2f",result);
    }

    private static long findFactorial(int firstNum) {
        long factorial = 1;
        for (int i = 1; i <= firstNum; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
