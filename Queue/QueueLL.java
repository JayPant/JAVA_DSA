package JAVA_DSA.Queue;

public class QueueLL {
     static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            next=null;
        }
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return (head == null && tail == null);
        }

        public static void add(int value){
            Node newNode = new Node(value);

            if(head == null){
                head=tail=newNode;
                return;
            }
            
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(isEmpty()) return -1;

            int value = head.val;
            if(head == tail){
                head=tail=null;
            }else{
            head=head.next;
        }
        return value;
        }

        public static int peek(){
            if(isEmpty()) return -1;

            return head.val;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
