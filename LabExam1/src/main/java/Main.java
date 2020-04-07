
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList <String> lst = new LinkedList<String>();
        
        lst.addLast("Rayan");
        lst.addLast("Ammar");
        lst.addLast("Fahad");
        lst.addLast("Sami");
        
        ListIterator <String> iter = lst.listIterator();
        
        iter.next();
        iter.next();
        iter.next();
        iter.previous();
        iter.remove();
        System.out.println(lst);
        

    }
    
}
