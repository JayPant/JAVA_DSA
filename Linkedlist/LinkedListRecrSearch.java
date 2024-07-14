public class LinkedListRecrSearch {
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

    public int helper(Node head, int key){

        if(head == null) return -1;

        if(head.val == key) return 0;

        int idx = helper(head.next, key);

        if(idx == -1) return -1;

        return idx+1; 

    }

    public int rcrSearch(int key){

       return helper(head, key);
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
        LinkedListRecrSearch ll = new LinkedListRecrSearch();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        System.out.println(ll.rcrSearch(3));

    }
}
