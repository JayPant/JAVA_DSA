public class LinkedList {
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

    public void addFirst(int data) {
        // step 1 :- create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 :- Assign head to newNode.next;
        newNode.next = head;
        // step 3:- update head
        head = newNode;
    }

    public void addMiddle(int index, int data){
        Node newNode = new Node(data);
        if(index==0){
            addFirst(data);
        }
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newNode.next= temp.next;
        temp.next=newNode;
    }

    public void addLast(int data) {
        // step 1 :- create new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 :- Assign tail.next to newNode;
        tail.next = newNode;
        // step 3:- update tail
        tail = newNode;
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
        LinkedList ll = new LinkedList();
        ll.printList();
        ll.addFirst(2);
        ll.printList();
        ll.addFirst(1);
        ll.printList();
        ll.addLast(4);
        ll.printList();
        ll.addLast(5);
        ll.printList();
        ll.addMiddle(2, 3);
        ll.printList();

    }
}