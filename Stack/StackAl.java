import java.util.ArrayList;

public class StackAl {

    public static class Stack {
        static ArrayList<Integer> stack = new ArrayList<>();

        public static boolean isEmpty() {
            return (stack.size() == 0);
        }

        public static void push(int data) {
            stack.add(data);
        }

        public static int pop() {
            if(isEmpty()) return -1;

            int value = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return value;
        }

        public static int peek() {
            if(isEmpty()) return -1;

            return stack.get(stack.size() - 1);
        }

        public static void main(String[] args) {
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
