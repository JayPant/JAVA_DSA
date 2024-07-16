public class ReverseDoubly {
    public class Node{
        int val;
        Node next, prev;    

        public Node(int val){
            this.val = val;
            this.next=null;
            this.prev= null;
        }
    }

    public static Node head,tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
                head=tail= newNode;
                return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
         
    }
    public void reverseList(){
            Node prev = null;
            Node curr = head;
            Node next;

            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            tail = head;
            head = prev;
        }

    public static void printList(){
        Node temp = head;
        while(temp!=null){ 
            System.out.print(temp.val + " <-> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseDoubly dl = new ReverseDoubly();
        dl.addFirst(5);
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        printList();
       dl. reverseList();
        printList();
        
    }
}
