import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();
        System.out.printf("%s%s%s",name,delimiter,lastName);
    }
}
