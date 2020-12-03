import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int [] peopleInWagon = new int[wagons];
        int sum = 0;
        for (int i = 0; i <wagons ; i++) {
            peopleInWagon [i] = Integer.parseInt(scanner.nextLine());
            sum += peopleInWagon[i];
        }
        for (int value : peopleInWagon) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
