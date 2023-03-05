package arrays;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");
        colors.add("Pink");

        System.out.println(colors);

        for(String color: colors){
            System.out.println(color);
        }

    }

}
