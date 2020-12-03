import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int [] numbers = new int[array.length];
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length ; j++) {
                sum = numbers[i] + numbers[j];
                if (sum == n){
                    System.out.println(numbers[i] + " " + numbers[j]);
                    sum = 0;
                }else {
                    sum = 0;
                }
            }
        }
    }
}
