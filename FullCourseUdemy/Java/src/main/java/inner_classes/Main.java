package inner_classes;

public class Main {

    public static void main(String[] args) {
        Gearbox audi = new Gearbox(6);
        Gearbox.Gear first = audi.new Gear(1,12.3);

        System.out.println(first.driveSpeed(1000));
    }
}

