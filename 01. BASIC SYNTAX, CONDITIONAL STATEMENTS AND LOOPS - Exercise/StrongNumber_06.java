import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - 48;
        int fact = 1;
        for (int y = 1; y <= digit; y++) {
            fact *= y;
        }
        sum += fact;
        }
        int inputNum = Integer.parseInt(input);
        if(sum == inputNum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
