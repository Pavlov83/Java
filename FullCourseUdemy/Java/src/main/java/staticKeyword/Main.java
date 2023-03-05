package staticKeyword;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance =new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + "instance Number "+
                StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " instance number" +
                StaticTest.getNumInstances());

        //static methods and fields belong to the class instead of its instances!
    }

}
