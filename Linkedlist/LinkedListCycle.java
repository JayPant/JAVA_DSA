/**
 * LinkedListCycle
 */
public class LinkedListCycle {

    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        // step 1 :- create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 :- Assign head to newNode.next;
        newNode.next = head;
        // step 3:- update head
        head = newNode;
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                return true;
            }
        }
        return false;
    }



    public void printList() {
        if (head == null) {
            System.out.println("LinedList is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= head;

        System.out.println(isCycle());
    }
    
}