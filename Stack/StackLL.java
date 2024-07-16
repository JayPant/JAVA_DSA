public class StackLL {
        public static class Stack {
        
            public static class Node{
                int val;
                Node next;

                public Node(int val){
                    this.val=val;
                    this.next=null;
                }
            }

            public static Node head;

            public static boolean isEmpty(){
                return head == null;
            }

            public static void push(int data){
                Node newNode = new Node(data);
                if(head!=null){
                    newNode.next=head;
                }
                head=newNode;
            }

            public static int peek(){
                if(isEmpty()) return -1;
                return head.val;
            }

            public static int pop(){
                if(isEmpty()) return -1;

                int value = head.val;
                head=head.next;
                return value;
            }

        
        public static void main(String[] args) {
            // Stack s = new Stack();
            push(1);
            push(2);
            push(3);
            push(4);
            push(5);

            while (!isEmpty()) {
                System.out.println(peek());
                pop(); // Pop the element after peeking
            }
        }
    }

}