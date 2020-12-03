import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");
        int [] firstArrayNumbers = new int [firstArray.length];
        int [] secondArrayNumbers = new int [secondArray.length];
        int sum = 0;
        int index = 0;
        boolean areIdentical = true;
        for (int i = 0; i <firstArray.length ; i++) {
            firstArrayNumbers [i] = Integer.parseInt(firstArray [i]);
        }
        for (int i = 0; i <secondArray.length ; i++) {
            secondArrayNumbers [i] = Integer.parseInt(secondArray [i]);
        }
        for (int i = 0; i < firstArray.length; i++) {
            sum += firstArrayNumbers[i];
            if (firstArrayNumbers[i] != secondArrayNumbers[i]) {
                index = i;
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                areIdentical = false;
                break;
            }
        }
        if (areIdentical){
            System.out.printf("Arrays are identical. Sum: %d",sum);
        }
    }
}
