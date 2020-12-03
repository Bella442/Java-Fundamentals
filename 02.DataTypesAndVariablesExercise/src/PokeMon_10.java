import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int pokeDistanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int targetCounter = 0;
        double pokePowerInHalf = pokePowerN * 0.5;

        while (pokePowerN >= pokeDistanceM) {
            pokePowerN -= pokeDistanceM;
            targetCounter++;
            if (pokePowerN == pokePowerInHalf) {
                if (pokePowerN > 0 && exhaustionFactorY > 0 ) {
                    pokePowerN /= exhaustionFactorY;
                }
            }
        }
        System.out.println(pokePowerN);
        System.out.println(targetCounter);
    }
}
