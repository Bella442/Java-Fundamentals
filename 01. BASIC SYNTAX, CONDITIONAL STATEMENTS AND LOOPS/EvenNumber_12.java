package bg.softuni.fundamentals;

import java.util.Scanner;

public class EvenNumber_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1;; i++) {

            if (num % 2 == 0) {
                System.out.printf("The number is: %d%n", Math.abs(num));
                break;
            } else {
                System.out.println("Please write an even number.");
            }
            num = Integer.parseInt(scanner.nextLine());
        }
    }
}
