import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if(grade >= 5.50){
            System.out.println("Excellent!");
        }
    }
}
