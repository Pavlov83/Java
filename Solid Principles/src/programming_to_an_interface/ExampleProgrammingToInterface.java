package programming_to_an_interface;

public class ExampleProgrammingToInterface {


    public static void main(String[] args) {
        Computer cm = new Computer();
        IDisplayModule dm2 = new Monitor();
        IDisplayModule dm3 = new Projector();

        cm.setDisplayModule(dm2);
        cm.display();
        cm.setDisplayModule(dm3);
        cm.display();
    }
}
