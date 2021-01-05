import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        switch (line){
            case "add":
                add(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
                break;
            case "multiply":
                multiply(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
                break;
            case "subtract":
                subtract(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
                break;
            case "divide":
                divide(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
                break;
        }
    }

    private static void divide(int  number1, int number2) {
        int result = number1 / number2;
        System.out.println(result);
    }

    private static void subtract(int  number1, int number2) {
        int result = number1 - number2;
        System.out.println(result);
    }

    private static void multiply(int number1, int number2) {
        int result = number1 * number2;
        System.out.println(result);
    }

    private static void add(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(result);
    }
}
