package abstract_classes;

public class Parrot extends Bird{

    public Parrot(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println("Fly far away");
    }

    @Override
    public void breathe(){
        System.out.println("Breathes like a monster");
    }
}
