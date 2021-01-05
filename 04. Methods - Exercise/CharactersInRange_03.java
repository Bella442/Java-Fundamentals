import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        if (first < second){
            charactersInRRange(first,second);
        }else{
            charactersInRRange(second,first);
        }
    }
    private static void charactersInRRange(char first,char second){
        for (char i =(char) (first + 1); i < second ; i++) {
            System.out.print(i + " ");
        }
    }
}
