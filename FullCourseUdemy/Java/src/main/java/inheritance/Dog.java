package inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,int brain,int body,int size,int weight,int eyes,int legs,int teeth,int tail){
        super(name, 1,1,size,weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    private void chew(){
        System.out.println("Dog chews");
    }

    @Override
    public void eat(){
        System.out.println("Dog eats");
        chew();
        super.eat();
    }

    public void walk(int speed){
        System.out.println();
        move();
    }

    public void run(){

    }
}
