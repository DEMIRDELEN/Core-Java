package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTuru {
    public static void main(String[] args) {

        Deque<String> ll4 = new LinkedList<>();
        ll4.add("cavidan");
        ll4.add("mesut");
        ll4.add("selim");
        ll4.add("tevfik");
        ll4.add("selim");

        ll4.removeLastOccurrence("selim");
        System.out.println(ll4);
        System.out.println(ll4.pop());

        //pop Belirtilen öğenin ilk oluşumunu bu deque'den kaldırır ve bize dondurur.

        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();
// Deque iki tarafli queue demektir, dolayisiyla her method'un first ve last'i var
    }
}
