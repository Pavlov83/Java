import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        if (number1 == number2) {
            if (number2 == number3) {
                if (number3 == number1) {
                    System.out.println("yes");
                }

            }
        }
        if (number1 != number2 && number2 != number1) {
            System.out.println("not equals");
        }
        else if (number2 != number3 && number3 != number1) {
            System.out.println("not equals");
        }
    }
}
