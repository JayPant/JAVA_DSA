public class LinkedListItr {
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

    public int itrSearch(int key){

        int idx = 0;
        Node temp = head;

        while(temp.next!=null){
            if(temp.val == key)
            {
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
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
        LinkedListItr ll = new LinkedListItr();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        System.out.println(ll.itrSearch(3));

    }
}
