import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LawfulAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LocalDate birthDay = LocalDate.parse(input,DateTimeFormatter.ofPattern("d-M-yyyy"));
        LocalDate ageAt18 = birthDay.plusYears(18);
        String lawfulAge = DateTimeFormatter.ofPattern("dd-MM-yyyy").format(ageAt18);
        System.out.println(lawfulAge);
    }
}