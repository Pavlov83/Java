import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cels =scanner.nextDouble();
        double fahr = cels * 1.8 + 32;

        System.out.printf("fahrenheit = %.2f", fahr);

    }
}
