package programming_to_an_interface;

public interface IDisplayModule {

    public void display();
}

class Monitor implements IDisplayModule{
    public void display(){
        System.out.println("Display through a Monitor");
    }
        }

class Projector implements IDisplayModule{
    public void display(){
        System.out.println("Display through a projector");
    }
}






