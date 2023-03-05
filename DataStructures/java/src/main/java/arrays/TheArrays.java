package arrays;

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "Green";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {1,4,5,2,3};

        //iterating over arrays

        for(int i = 0; i < numbers.length-1;i++){
            System.out.println(numbers[i]);
        }


    }
}
