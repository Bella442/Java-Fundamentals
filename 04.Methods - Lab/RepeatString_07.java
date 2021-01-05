import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int timesToRepeat = Integer.parseInt(scanner.nextLine());
        String resultRepeated = repeatString(line, timesToRepeat);
        System.out.println(resultRepeated);

    }
    static String repeatString(String input, int count){
        String result = "";
        for (int i = 0; i < count ; i++) {
            result += input;
        }
        return result;
    }
}
