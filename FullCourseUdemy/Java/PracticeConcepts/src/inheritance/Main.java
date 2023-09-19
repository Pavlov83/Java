package inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Generic Animal ","Huge ",400);
        doAnimalStuff(animal1,"slow");

        Dog dog = new Dog();
        doAnimalStuff(dog,"fast");

        Dog doggo = new Dog("Husky",23);
    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("--------");
    }
}
