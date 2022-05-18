package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {

        Queue<String> Vegetable = new LinkedList<>();

        Vegetable.add("carrot");
        Vegetable.add("lettuce");
        Vegetable.add("potato");
        Vegetable.add("tomato");
        Vegetable.add("garlic");
        Vegetable.add("ginger");
        Vegetable.add("avocado");
        System.out.println(Vegetable);

        // Peak first element
        System.out.println("Pick first element :" +"\n" + Vegetable.peek());

        // Print first element
        System.out.println("Print first element :" +"\n" + Vegetable.element());

        // Remove one element
        System.out.println("Remove tomato :" +"\n" + Vegetable.remove("tomato"));

        // Poll (pick and remove)
        Vegetable.poll();
        System.out.println("After first poll" +"\n" + Vegetable);

        // Check if it contains garlic
        System.out.println("Check if it queue contains garlic : " + Vegetable.contains("garlic"));

        System.out.println("Print elements after second poll using for each loop ");
        // Poll again and print all element with for each
        Vegetable.poll();
        for (String veggie : Vegetable) {
            System.out.println(veggie);
        }
        System.out.println("Print elements after second poll using iterator ");
        Iterator<String> it = Vegetable.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
