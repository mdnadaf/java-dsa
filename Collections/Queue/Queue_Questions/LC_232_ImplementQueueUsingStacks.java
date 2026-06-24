import java.util.Stack;

public class LC_232_ImplementQueueUsingStacks {

    static class MyQueue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        // O(1)
        public void push(int x) {
            s1.push(x);
        }

        // Amortized O(1)
        public int pop() {
            peek(); // Ensure s2 has elements
            return s2.pop();
        }

        // Amortized O(1)
        public int peek() {

            if (s2.empty()) {
                while (!s1.empty()) {
                    s2.push(s1.pop());
                }
            }

            return s2.peek();
        }

        // O(1)
        public boolean empty() {
            return s1.empty() && s2.empty();
        }
    }

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.push(3);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removed: " + queue.pop());
        System.out.println("Removed: " + queue.pop());

        queue.push(4);

        System.out.println("Front Element: " + queue.peek());

        while (!queue.empty()) {
            System.out.println("Removed: " + queue.pop());
        }
    }
}

/* OUTPUT

Front Element: 1
Removed: 1
Removed: 2
Front Element: 3
Removed: 3
Removed: 4
*/
