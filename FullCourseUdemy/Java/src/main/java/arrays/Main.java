package arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 10;

        System.out.println(myIntArray[5]);


        for(int i = 0; i < 10; i++){
            myIntArray[i]= i*10;
        }
        for(int i = 0;i <10; i++ ){
            System.out.println("Element " + i + "value is " + myIntArray[i]);
        }
    }
}
