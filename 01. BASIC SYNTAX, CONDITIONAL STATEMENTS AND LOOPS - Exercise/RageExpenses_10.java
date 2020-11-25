import java.util.Scanner;

public class RageExpenses_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double totalExpences = 0;
        int keyboardCounter = 0;
        int displayCounter = 0;

        for (int i = 1; i <= lostGames ; i++) {
            if (i % 2 == 0) {
                totalExpences += headsetPrice;
            }
            if (i % 3 == 0) {
                totalExpences += mousePrice;
                keyboardCounter++;
                displayCounter++;
                if (keyboardCounter == 2){
                    totalExpences += keyboardPrice;
                    keyboardCounter = 0;
                }
                if (displayCounter == 4){
                    totalExpences += displayPrice;
                    displayCounter = 0;
                }
            }
        }

        System.out.printf("Rage expenses: %.2f lv.",totalExpences);
    }
}
