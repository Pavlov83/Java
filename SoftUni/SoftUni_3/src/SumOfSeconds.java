import java.util.Scanner;

public class SumOfSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in_1 = Integer.parseInt(scanner.nextLine());
        int in_2 = Integer.parseInt(scanner.nextLine());
        int in_3 = Integer.parseInt(scanner.nextLine());
        int seconds = in_1 + in_2 + in_3;
        int minutes = seconds / 60;
        if (seconds >= 0 && seconds <= 59) {

            if (seconds < 10) {

                System.out.printf("0:" + seconds);
            } else {
                System.out.printf("%d:%d", minutes, seconds);
            }

        } else if (seconds >= 60 && seconds <= 120) {
            seconds = seconds - 60;

            if (seconds < 10) {

                System.out.printf("0:" + seconds);
            }else  {
                System.out.printf("%d:%d", minutes, seconds);
            }if (seconds >= 120 && seconds <= 279) {
                seconds = seconds - 60;

                if (seconds < 10) {

                    System.out.printf("0:" + seconds);
                } else {
                    System.out.printf("%d:%d", minutes, seconds);
                }

            }

        }
    }
}
