
import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList <String>();
        ListIterator iter1 = list.listIterator();
        ListIterator iter2 = list.listIterator();
        
        list.addFirst("one");
        list.add("four");
        list.add("three");
        list.addLast("five");
        
        System.out.println(list);
        
        iter1.next();
        iter1.add("two");
        list.removeLast();
        list.remove(2);
        
        System.out.println(list);
        
        iter2.add(iter2.next() + " and a half");
        iter2.add(iter2.next() + " and a half");
        iter2.add(iter2.next() + " and a half");
        
        System.out.println(list);
    }
}
