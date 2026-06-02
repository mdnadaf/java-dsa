import java.util.LinkedList;

public class LinkedListFunction {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. addFirst(), addLast() -> O(1) (Direct head/tail access)
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addLast(40);

        System.out.println("List: " + list);
        // [10, 20, 30, 40]

        // 2. getFirst(), getLast() -> O(1) (Sirf value check karta hai bina delete kiye)
        System.out.println("First: " + list.getFirst()); // 10
        System.out.println("Last: " + list.getLast());   // 40

        // 3. offer(), offerFirst(), offerLast() -> O(1) (Elements insert karta hai)
        list.offer(50);        // end me add -> O(1)
        list.offerFirst(5);    // start me add -> O(1)
        list.offerLast(60);    // end me add -> O(1)

        System.out.println("After offer: " + list);
        // [5, 10, 20, 30, 40, 50, 60]

        // 4. peek(), peekFirst(), peekLast() -> O(1) (Keval pehla/aakhiri element dekhta hai, list khali hone par null deta hai exception nahi)
        System.out.println("peek(): " + list.peek());         // 5 -> O(1)
        System.out.println("peekFirst(): " + list.peekFirst());// 5 -> O(1)
        System.out.println("peekLast(): " + list.peekLast()); // 60 -> O(1)

        // 5. poll(), pollFirst(), pollLast() -> O(1) (Pehla/aakhiri element nikalta (remove) aur return karta hai)
        System.out.println("poll(): " + list.poll());         // 5 -> O(1)
        // [10, 20, 30, 40, 50, 60] -> 10 child node bacha
        System.out.println("pollFirst(): " + list.pollFirst());// 10 -> O(1)
        System.out.println("pollLast(): " + list.pollLast()); // 60 -> O(1)

        System.out.println("After poll: " + list);
        // [20, 30, 40, 50]

        // 6. removeFirst(), removeLast() -> O(1) (Elements delete karta hai, list khali hone par exception deta hai)
        list.removeFirst(); // 20 remove -> O(1)
        list.removeLast();  // 50 remove -> O(1)

        System.out.println("Final List: " + list);
        // [30, 40]
    }
}