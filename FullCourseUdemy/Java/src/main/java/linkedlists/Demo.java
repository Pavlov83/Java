package linkedlists;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {
        LinkedList <String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sofia");
        placesToVisit.add("Varna");
        placesToVisit.add("Sopot");
        placesToVisit.add("Burgas");
        placesToVisit.add("London");

        printList(placesToVisit);
        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Mow visiting" + i.next());
        }
        System.out.println("====================");
    }
}
