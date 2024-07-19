package JAVA_DSA.Queue;

import java.util.Scanner;

public class QueueArray {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear;
        static int front; // Add front to track the start of the queue

        Queue(int n){
            arr= new int[n];
            size=n;
            rear=-1;
            front=0; // Initialize front
        }

        public static boolean isEmpty(){
            return rear < front; // Queue is empty if rear is less than front
        }

        public static void enqueue(int val){
            if(rear == size -1){
                System.out.println("Overflow");
                return;
            }
            rear=rear+1;
            arr[rear] = val;
        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("UnderFlow");
                return -1;
            }
            int value = arr[front];
            front++; // Move front forward
            return value;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("UnderFlow");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
