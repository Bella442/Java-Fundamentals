import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] arrayAsString = scanner.nextLine().split(" ");
        int [] numbers = new int[arrayAsString.length];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arrayAsString.length ; i++) {
            numbers[i] = Integer.parseInt(arrayAsString[i]);
            if (numbers [i] % 2 == 0){
                sumEven += numbers[i];
            }else{
                sumOdd += numbers[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
