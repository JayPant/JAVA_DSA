public class ReverseItr {
    // Inner Node class to represent each node in the linked list
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

    // Method to reverse the linked list iteratively
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        // Traverse the list and reverse the links
      
        while (curr != null) {
            next = curr.next; // Store next node
            curr.next = prev; // Reverse current node's pointer to prev
            prev = curr;      // Move prev and curr pointers one step forward
            curr = next;
        }
        // Update the head to the last node processed
        head = prev;
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
        ReverseItr ll = new ReverseItr();
        ll.addFirst(6);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.reverse();
        ll.printList();
    }
}
