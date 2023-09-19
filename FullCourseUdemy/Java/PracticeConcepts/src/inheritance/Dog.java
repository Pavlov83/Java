package inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public void setEarShape(String earShape){
        this.earShape = earShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }

    public String getTailShape(){
        return this.tailShape;
    }

    public String getEarShape(){
        return this.earShape;
    }


    public Dog(){
        super("Muttley","Mid sized",4);
    }

    public Dog(String type, int weight){
        this(type,weight,"Perky", "Curled");
    }

    public Dog(String type, int weight, String earShape, String tailShape ){
        super(type,weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
    }

    @Override
    public String toString(){
        return "Dog{"+ "earShape= " + earShape +
                '\'' + ", tailShape='" + tailShape + '\'' + "} "
                + super.toString();
    }
    public void bark(){
        System.out.println("The dog is barking");
    }

    public void run(){
        System.out.println("the dog is running");
    }

    public void walk(){
        System.out.println("The dog is walking");
    }

    public void wagTail(){
        System.out.println("The dog is wagging tail");
    }

}
