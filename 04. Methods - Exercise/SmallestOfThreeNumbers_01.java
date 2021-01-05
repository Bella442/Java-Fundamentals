import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int smallerNum = smallerNumber(firstNum,secondNum);
        int smallestNum = smallerNumber(smallerNum,thirdNum);
        System.out.println(smallestNum);
    }
    private static int smallerNumber(int a, int b){
        if (a < b){
            return a;
        }
        return b;
    }
}
