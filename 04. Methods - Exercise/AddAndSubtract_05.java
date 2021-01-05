import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int added = addFirstToSecond(firstNum,secondNum);
        int subtracted = subtract(added,thirdNum);
        System.out.println(subtracted);
    }
    private static int addFirstToSecond(int a, int b){
        return a + b;
    }
    private static int subtract(int a, int b){
        return a - b;
    }
}
