import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeForParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LocalDate drinkingNight = LocalDate.parse(input,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String dayOfWeek = drinkingNight.getDayOfWeek().toString();
        String output = dayOfWeek.substring(0,1).toUpperCase()
                + dayOfWeek.substring(1, dayOfWeek.length()).toLowerCase();
        if (dayOfWeek.equals("FRIDAY") || dayOfWeek.equals("SATURDAY")){
            System.out.printf("Party night! Today is: %s",output);
        } else {
            System.out.printf("No party tonight! Today is: %s",output);
        }
    }
}