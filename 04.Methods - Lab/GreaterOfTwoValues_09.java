import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valueType = scanner.nextLine();
        String firstValue = scanner.nextLine();
        String secondValue = scanner.nextLine();
        switch (valueType){
            case "int":
                int firstNum = Integer.parseInt(firstValue);
                int secondNum = Integer.parseInt(secondValue);
                int intResult = getMax(firstNum,secondNum);
                System.out.println(intResult);
                break;
            case "char":
                char first = firstValue.charAt(0);
                char second = secondValue.charAt(0);
                char charResult = getMax(first,second);
                System.out.println(charResult);
                break;
            case "string":
                String stringResult = getMax(firstValue,secondValue);
                System.out.println(stringResult);
                break;
        }
    }

    private static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum){
            return firstNum;
        }
        return secondNum;
    }
    static char getMax(char first, char second){
        if (first > second){
            return first;
        }
        return second;
    }
    static String getMax(String first, String second){
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }
}
