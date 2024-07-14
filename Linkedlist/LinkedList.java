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

    // add middle
    public void addMiddle(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            addFirst(data);
        }
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // add last
    public void addLast(int data) {
        // step 1 :- create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 :- Assign tail.next to newNode;
        tail.next = newNode;
        // step 3:- update tail
        tail = newNode;
    }

    // remove first
    public int removeFirst() {

        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.val;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.val;
        head = head.next;
        size--;
        return value;
    }

    // remove last
    public static int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.val;
            head = tail = null;
            size = 0;
            return value;
        }

        // int index = 0;
        Node prev = head;
        while (prev.next.next!=null) {
            prev = prev.next;
        }

        int value = prev.next.val;
        prev.next = null;
        tail = prev;
        size--;
        return value;
    }

    public static int removeMiddle(int index) {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int value = head.val;
            head = tail = null;
            size = 0;
            return value;
        }

        int i=0;
        Node prev = head;
        while(i<index-1){
            prev = prev.next;
            i++;
        }

        int value = prev.next.val;
        prev.next= prev.next.next;
        size--;

        return value;

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
        System.out.println(LinkedList.size);
        removeMiddle(2);
        ll.printList();
        System.out.println(LinkedList.size);


    }
}
