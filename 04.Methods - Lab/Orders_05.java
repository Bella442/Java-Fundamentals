import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        totalPriceOfOrder(product,quantity);
    }
    static void totalPriceOfOrder(String product,int quantity){
        double price = 0;
        double totalPrice = 0;
        switch (product){
            case "coffee":
                price = quantity * 1.50;
                totalPrice += price;
                break;
            case "water":
                price = quantity * 1.0;
                totalPrice += price;
                break;
            case "coke":
                price = quantity * 1.4;
                totalPrice += price;
                break;
            case "snacks":
                price = quantity * 2.0;
                totalPrice += price;
                break;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
