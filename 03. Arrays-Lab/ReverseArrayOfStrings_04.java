import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayOfStrings = scanner.nextLine();
        String [] strings = arrayOfStrings.split(" ");
        for (int i = 0; i < strings.length / 2; i++) {
            String oldString = strings [i];
            strings [i] = strings[strings.length - 1 - i];
            strings [strings.length - 1 - i] = oldString;
        }
        System.out.println(String.join(" ",strings));
    }
}
