import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. add()
        list.add(10);
        list.add(20);
        list.add(30);

        // 2. addFirst()
        list.addFirst(5);

        // 3. addLast()
        list.addLast(40);

        System.out.println(list); // [5, 10, 20, 30, 40]

        // 4. getFirst()
        System.out.println(list.getFirst()); // 5

        // 5. getLast()
        System.out.println(list.getLast()); // 40

        // 6. removeFirst()
        list.removeFirst();
        System.out.println(list); // [10, 20, 30, 40]


        // 7. removeLast()
        list.removeLast(); // [10, 20, 30]
        System.out.println(list); 

        // 8. contains()
        System.out.println(list.contains(20)); // true

        // 9. size()
        System.out.println(list.size()); // 3

        // 10. Traversal
        for(Integer num : list){
            System.out.println(num);
        }
    }
}