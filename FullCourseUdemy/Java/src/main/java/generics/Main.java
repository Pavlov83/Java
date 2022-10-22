package generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);


        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer elrond = new BaseballPlayer("Elrond");

        Team lyulinRats = new Team("LY Rats");
        lyulinRats.addPlayer(joe);
        lyulinRats.addPlayer(elrond);
        System.out.println(lyulinRats.numPlayers());

    }

    private static void printDoubled(ArrayList<Integer> n){
        for(Object i : n){
            System.out.println((Integer) i * 2);
        }
    }
}
