/**
 * Find&RemoventhNode
 */
public class FindNRemoventhNode {
    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Head and tail of the linked list
    public static Node head;
    public static Node tail;
    public static int size;

    // Method to add a new node at the beginning of the list
    public void addFirst(int data) {
        // Step 1: Create a new node
        Node newNode = new Node(data);
        size++;
        // If the list is empty, set both head and tail to the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2: Assign head to newNode.next
        newNode.next = head;
        // Step 3: Update head to newNode
        head = newNode;
    }

    public void removeNthElement(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if(size == n){
            head=head.next;
            return;
        }

        Node prev = head;
        int nth =1;
        int nthNode = size-n;

        while(nth<nthNode){
            prev=prev.next;
            nth++;
        }
        prev.next = prev.next.next;
        return;

    }

    // Method to print the elements of the linked list
    public void printList() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
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
        FindNRemoventhNode ll = new FindNRemoventhNode();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printList();
        ll.removeNthElement(2);
        ll.printList();
    }

}  