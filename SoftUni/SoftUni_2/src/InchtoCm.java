import java.util.Scanner;

public class InchtoCm {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double inch = 2.54;
        double cm = scan.nextDouble();

        double convert = cm * 2.54;

        System.out.println(convert);


    }
}
