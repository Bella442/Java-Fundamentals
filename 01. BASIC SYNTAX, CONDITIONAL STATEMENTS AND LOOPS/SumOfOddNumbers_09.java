package bg.softuni.fundamentals;

import java.util.Scanner;

public class SumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1;i <=n;i++){
            System.out.println(2 * i - 1);
                sum += 2 * i - 1;
            }
        System.out.printf("Sum: %d",sum);
    }
}
