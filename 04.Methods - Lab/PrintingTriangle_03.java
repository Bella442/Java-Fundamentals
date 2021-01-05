import java.util.Scanner;

public class PrintingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            printLine(i);
        }
        for (int i = number -1; i >=1 ; i--) {
            printLine(i);
        }
    }
    static void printLine(int maxNumber) {
        for (int i = 1; i <= maxNumber ; i++) {
            System.out.print(i);
            if (i < maxNumber){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
