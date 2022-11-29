package programming_to_an_interface;

public class Computer {
    IDisplayModule dm;

    public void setDisplayModule(IDisplayModule dm){
        this.dm = dm;
    }

    public void display(){
        dm.display();
    }
}
