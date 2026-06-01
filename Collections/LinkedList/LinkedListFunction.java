import java.util.LinkedList;

public class LinkedListFunction {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // addFirst(), addLast()
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);

        System.out.println("List: " + list);
        // [10, 20, 30, 40]

        // getFirst(), getLast()
        System.out.println("First: " + list.getFirst()); // 10
        System.out.println("Last: " + list.getLast());   // 40

        // offer(), offerFirst(), offerLast()
        list.offer(50);        // end me add
        list.offerFirst(5);    // start me add
        list.offerLast(60);    // end me add

        System.out.println("After offer: " + list);
        // [5, 10, 20, 30, 40, 50, 60]

        // peek(), peekFirst(), peekLast()
        System.out.println("peek(): " + list.peek());         // 5
        System.out.println("peekFirst(): " + list.peekFirst());// 5
        System.out.println("peekLast(): " + list.peekLast()); // 60

        // poll(), pollFirst(), pollLast()
        System.out.println("poll(): " + list.poll());         // 5
        System.out.println("pollFirst(): " + list.pollFirst());// 10
        System.out.println("pollLast(): " + list.pollLast()); // 60

        System.out.println("After poll: " + list);
        // [20, 30, 40, 50]

        // removeFirst(), removeLast()
        list.removeFirst(); // 20 remove
        list.removeLast();  // 50 remove

        System.out.println("Final List: " + list);
        // [30, 40]
    }
}