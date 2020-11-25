import java.util.Scanner;

public class PadawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double lightsabersPriceFor1 = Double.parseDouble(scanner.nextLine());
        double robesPriceFor1 = Double.parseDouble(scanner.nextLine());
        double beltsPriceFor1 = Double.parseDouble(scanner.nextLine());

        double lightsabersPrice = lightsabersPriceFor1 * Math.ceil(countStudents + (countStudents * 0.1));
        double robesPrice = robesPriceFor1 * countStudents;
        int freeBelts = countStudents / 6;
        double beltsPrice = beltsPriceFor1 * (countStudents - freeBelts);
        double totalPrice = lightsabersPrice + robesPrice + beltsPrice;
        if (money >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }else {
            double moneyNeeded = totalPrice - money;
            System.out.printf("Ivan Cho will need %.2flv more.",moneyNeeded);
        }
    }
}
