package JAVA_DSA.Queue;

public class CircularQueueAr {
    static class Queue{
        static int arr[];
        static int size;
        static int front ;
        static int rear ;

        Queue(int n){
            arr = new int[n];
            size = n;
            front=-1;
            rear=-1;
        }

        public static boolean isEmpty(){
            return (rear==-1 && front ==-1);
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int val){
            if(isFull()) return;
            
            if(front ==1) front =0;

            rear= (rear+1) % size;
            arr[rear]= val;
        }

        public static int remove(){
            if(isEmpty()) return -1;

            int value = arr[front];
            if(front == rear){
                front = rear =-1;
            }else{
                front = (front+1)%size;
            }

            return value;
        }

        public static int peek(){
            if(isEmpty()) return -1;

            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
 