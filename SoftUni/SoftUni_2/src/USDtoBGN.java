import java.util.Scanner;

public class USDtoBGN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bgn = scanner.nextDouble();
        double usd = bgn * 1.79549;
        System.out.printf("USD = %.2f", usd);
    }
}
