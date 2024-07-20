package JAVA_DSA.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeICF {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();

        q.add(2);
        q.add(3);
        q.add(4);
        q.addLast(5);
        q.addFirst(1);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }   
}
