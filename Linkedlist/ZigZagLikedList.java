public class ZigZagLikedList {
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
    public static void addFirst(int data) {
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

    public static void zigzag(){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }

        Node mid = slow;
       
        Node curr = mid.next;
        mid.next = null;
        Node prev =null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right= prev;

        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next= nextL;

            left = nextL;
            right=nextR;
        }

    }


    // Method to print the elements of the linked list
    public static void printList() {
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
        // ReverseItr ll = new ReverseItr();
        addFirst(6);
        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        printList();
        zigzag();
        printList();


    }
}
