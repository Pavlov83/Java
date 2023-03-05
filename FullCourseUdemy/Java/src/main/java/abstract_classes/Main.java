package abstract_classes;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Hokkaido");
        dog.breathe();
        dog.eat();


        Parrot parrot = new Parrot("Cockatoo sparrow");
        parrot.fly();
        parrot.eat();
        parrot.fly();
    }
}