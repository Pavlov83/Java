package autoboxing_and_unboxing;

import lists_arraylists.ArryList;

import java.util.ArrayList;

class IntClass{
    private int myValue;
    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue(){
        return this.myValue;
    }
}

public class AutoboxingAndUnboxing {


    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Pavlov");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //Autoboxing example
        ArrayList<Integer> intArraySecondList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArraySecondList.add(Integer.valueOf(i));
        }


        //unboxing is converting it to prime
        for (int i = 0; i <= 10;i++){
            System.out.println(i + "-->" + intArraySecondList.get(i).intValue());
        }

    }
}
