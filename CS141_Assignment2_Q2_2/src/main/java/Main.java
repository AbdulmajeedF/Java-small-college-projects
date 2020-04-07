import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add("one");
        list.add("four");
        list.add("three");
        list.add("five");
        
        System.out.println(list);
        
        ListIterator iter1 = list.listIterator();
        
        iter1.next();
        iter1.add("two");
        list.remove(4);
        list.remove(2);
        
        System.out.println(list);
        
        ListIterator iter2 = list.listIterator();
        
        iter2.add(iter2.next() + " and a half");
        iter2.add(iter2.next() + " and a half");
        iter2.add(iter2.next() + " and a half");
        
        System.out.println(list);
        
    }
    
}
