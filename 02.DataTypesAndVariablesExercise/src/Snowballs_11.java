import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte numberOfSnowballs = Byte.parseByte(scanner.nextLine());
        double maxSnowballValue = 0.0;
        short maxSnowballSnow = 0;
        short maxSnowballTime = 0;
        short maxSnowballQuality = 0;
        for (int i = 0; i < numberOfSnowballs; i++) {
            short currentSnowballSnow = Short.parseShort(scanner.nextLine());
            short currentSnowballTime = Short.parseShort(scanner.nextLine());
            byte currentSnowballQuality = Byte.parseByte(scanner.nextLine());
            double currentSnowball = Math.pow ((currentSnowballSnow / currentSnowballTime), currentSnowballQuality);
            if (currentSnowball > maxSnowballValue){
                maxSnowballValue = currentSnowball;
                maxSnowballSnow = currentSnowballSnow;
                maxSnowballTime = currentSnowballTime;
                maxSnowballQuality = currentSnowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow,maxSnowballTime,maxSnowballValue,maxSnowballQuality);
    }
}
