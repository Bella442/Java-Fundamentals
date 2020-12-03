import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int totalLiters = 0;
        for (int i = 0; i < n; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            if ((currentLiters + totalLiters) <= capacity){
                totalLiters += currentLiters;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(totalLiters);
    }
}
