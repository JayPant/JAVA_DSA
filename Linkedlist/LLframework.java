import java.util.LinkedList;

public class LLframework {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.addFirst(2);
        list.add(3);
        list.addLast(4);
        list.remove();

        System.out.println(list);
    }
}
