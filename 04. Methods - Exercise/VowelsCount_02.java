import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = vowelsCount(input);
        System.out.println(result);
    }
    private static int vowelsCount(String line){
        int sum = 0;
        line = line.toLowerCase();
        for (int i = 0; i < line.length() ; i++) {
            char currentLetter = line.charAt(i);

            switch (currentLetter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    sum++;
                    break;
            }
        }
        return sum;
    }
}
