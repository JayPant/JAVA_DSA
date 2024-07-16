/**
 * SortList
 */
public class SortList {

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
    private static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }


    public static Node mergeSort(Node head){
        if(head == null || head.next == null) return head;
        Node mid = getMid(head);

        Node rightHead= mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft,newRight);
    }

    private static Node merge(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(head1!=null&&head2!=null){
            if(head1.val<=head2.val){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next = head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }

        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return dummy.next;
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
        addFirst(1);
        addFirst(5);
        addFirst(4);
        addFirst(6);
        addFirst(2);
        addFirst(1);
        printList();
        head=mergeSort(head);
        printList();

    }
}