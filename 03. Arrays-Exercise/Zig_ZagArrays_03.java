import java.util.Scanner;

public class Zig_ZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int [] firstArray = new int[n];
        int [] secondArray = new int[n];
        for (int i = 1; i <= firstArray.length; i++) {
         String [] input = scanner.nextLine().split(" ");
         if (i % 2 != 0){
             firstArray[i -1] = Integer.parseInt(input [0]);
             secondArray[i - 1] = Integer.parseInt(input [1]);
         }else {
             firstArray[i - 1] = Integer.parseInt(input[1]);
             secondArray[i - 1] = Integer.parseInt(input[0]);
         }
        }
        for (int value : firstArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (int value: secondArray) {
            System.out.print(value + " ");
        }
    }
}
