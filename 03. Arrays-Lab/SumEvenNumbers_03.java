import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayAsString = scanner.nextLine();
        String [] numbersAsString = arrayAsString.split(" ");
        int [] array = new int[numbersAsString.length];
        int evenSum = 0;
        for (int i = 0; i < numbersAsString.length ; i++) {
            array [i] = Integer.parseInt(numbersAsString[i]);
            if (array [i] % 2 == 0){
                evenSum += array [i];
            }
        }
        System.out.println(evenSum);
    }
}
