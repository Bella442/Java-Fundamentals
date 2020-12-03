import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalSpices = 0;
        int currentDayYield = startingYield;
        int dayCounter = 0;
        while (currentDayYield >= 100){
            totalSpices += currentDayYield;
            totalSpices -= 26;
            dayCounter++;
            currentDayYield -= 10;

        }
        if (totalSpices > 26){
            totalSpices -= 26;
        }
        System.out.println(dayCounter);
        System.out.println(totalSpices);
    }
}
