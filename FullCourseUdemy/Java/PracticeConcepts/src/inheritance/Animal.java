package inheritance;

public class Animal {

    private String type;
    private String size;
    private int weight;

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public Animal(){

    }

    public Animal(String type, String size, int weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;


    }

    public void move(String speed){
        System.out.println(type + "moves" + speed);
    }

    public void makeNoise(){
        System.out.println(type + " makes noise" );
    }
}
