import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float width,height,rectArea;

        width = scan.nextInt();
        height = scan.nextInt();

        rectArea = width * height;
        System.out.println(rectArea);



    }
}
