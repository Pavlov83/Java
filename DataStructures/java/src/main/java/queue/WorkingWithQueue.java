package queue;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {

    public static void main(String[] args) {


        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex",21));
        supermarket.add(new Person("Pav",45));
        System.out.println(supermarket.peek());
        supermarket.size();
        supermarket.poll();
    }
    static record Person(String name,int age){}
}
