import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<String>();

        linkedList.add("java");
        linkedList.add("c++");
        linkedList.add("python");

        ((LinkedList<String>) linkedList).addFirst("swift");

        ((LinkedList<String>) linkedList).addLast("ruby");

        linkedList.add(2,"pascal");

        linkedList.remove("pascal");


        ListIterator<String> itr = linkedList.listIterator();
        while (itr.hasNext())
            System.out.println(itr.next());


        System.out.println("head: " +((LinkedList<String>) linkedList).getFirst());

        System.out.println("tail: " +((LinkedList<String>) linkedList).getLast());

      
        linkedList.clear();
        System.out.println("linked list after cleaning: " +linkedList.toString());

    }
}
