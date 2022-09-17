package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkList_QueueDataTuru {
    public static void main(String[] args) {

        Queue<String> ll3 = new LinkedList<>();

        ll3.add("adem");
        ll3.add("zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        // Queue kuyruk demek sıra önemlidir. gelen son giden basa gider.

        System.out.println(ll3);

        ll3.remove();

        System.out.println(ll3);

        ll3.remove("Hpolat");

        System.out.println(ll3);

        System.out.println(ll3.element());  //zeynep
        System.out.println(ll3.peek()); //zeynep

        Queue<String> ll4 = new LinkedList<>();

        //System.out.println(ll4.element()); //throws exception
        System.out.println(ll4.peek());
        // peek ve element silmeden ilk elementi bize dondurur.
        // aralarındaki fark boş liste olursa peek null doner, element exception fırlatır.

        ll3.offer("ahmet");
        System.out.println(ll3);

        ll3.poll();
        System.out.println(ll3);

        //ll4.remove(); //throws exception
        //System.out.println(ll4); //throws exception

        System.out.println(ll4.poll());



    }
}
