import java.util.Scanner;

public class RadiansToDegrees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = scanner.nextDouble();
        double degrees = Math.round((180 / Math.PI) * radians);
        System.out.println(degrees);

    }
}
