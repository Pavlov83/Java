import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double value  = Double.parseDouble(scanner.nextLine());
        String inputCurrency = scanner.nextLine();
        String outputCurrency = scanner.nextLine();

        double USD = 1.79549;
        double EUR = 1.95583;
        double GBP = 2.53405;

        if ("BGN".equals(inputCurrency)) {
        } else if ("USD".equals(inputCurrency)) {
            value = value * USD;

        } else if ("EUR".equals(inputCurrency)) {
            value = value * EUR;

        } else if ("GBP".equals(inputCurrency)) {
            value = value * GBP;

        }

        if ("BGN".equals(outputCurrency)) {
        } else if ("USD".equals(outputCurrency)) {
            value = value / USD;

        } else if ("EUR".equals(outputCurrency)) {
            value = value / EUR;

        } else if ("GBP".equals(outputCurrency)) {
            value = value / GBP;

        }

        System.out.printf("%.2f %s",value,outputCurrency);
    }
}