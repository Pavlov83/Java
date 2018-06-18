import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figure = console.nextLine();
        double x1 = Double.parseDouble(console.nextLine());

        if (figure.equals("square")) {
            double area= (x1 * x1);
            System.out.println(area);

        }   else if (figure.equals("rectangle")) {
            double x2= Double.parseDouble(console.nextLine());
            double area= (x1 * x2);
            System.out.println(area);

        }   else if (figure.equals("circle")) {
            double area= (Math.PI * x1 * x1);
            System.out.println(area);
        }
        else if (figure.equals("triangle")) {
            double x2= Double.parseDouble(console.nextLine());
            double area= (x1 * x2/2);
            System.out.println(area);
        }
    }
}