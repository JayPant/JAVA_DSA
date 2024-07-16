public class DoublyLinkedList {
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

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
                head=tail= newNode;
                return;
        }
        newNode.prev= tail;
        tail.next= newNode;
        newNode.next=null;
        tail = newNode;

    }

    public int removeFirst(){
        if(head == null) {
            System.out.println("LL is empty");
            return -555;
        }
         if(size ==1){
            int value = head.val;
            head = null;
            tail=null;
            size=0;
            return value;
         }
        int value = head.val;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    public int removelast(){
        if(head == null) {
            System.out.println("LL is empty");
            return -555;
        }
         if(size ==1){
            int value = head.val;
            head = null;
            tail=null;
            size=0;
            return value;
         }

         int value = tail.val;
         tail=tail.prev;
         tail.next = null;
         size--;
         return value;

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
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.addFirst(5);
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.addLast(6);
        dl.removelast();
        printList();
    }
}
