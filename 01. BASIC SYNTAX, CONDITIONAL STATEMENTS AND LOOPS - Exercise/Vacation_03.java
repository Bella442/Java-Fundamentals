import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double price = 0;

        switch (groupType){
            case "Students":
                if (dayOfTheWeek.equals("Friday")){
                    price = countPeople * 8.45;
                }else if (dayOfTheWeek.equals("Saturday")){
                    price = countPeople * 9.80;
                }else if (dayOfTheWeek.equals("Sunday")){
                    price = countPeople * 10.46;
                }
                if (countPeople >= 30){
                    price *= 0.85;
                }
                break;
            case "Business":
                if (countPeople >= 100){
                    countPeople -= 10;
                }
                if (dayOfTheWeek.equals("Friday")){
                    price = countPeople * 10.90;
                }else if (dayOfTheWeek.equals("Saturday")){
                    price = countPeople * 15.60;
                }else if (dayOfTheWeek.equals("Sunday")){
                    price = countPeople * 16;
                }
                if (countPeople >= 100){

                }
                break;
            case "Regular":
                if (dayOfTheWeek.equals("Friday")){
                    price = countPeople * 15;
                }else if (dayOfTheWeek.equals("Saturday")){
                    price = countPeople * 20;
                }else if (dayOfTheWeek.equals("Sunday")){
                    price = countPeople * 22.50;
                }
                if (countPeople >= 10 && countPeople <= 20){
                    price *= 0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f",price);
    }
}
