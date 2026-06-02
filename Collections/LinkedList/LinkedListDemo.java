import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. add()  // O(1) (Direct tail pointer ka use karke end mein add hota hai)
        list.add(10);
        list.add(20);
        list.add(30);

        // 2. addFirst()  // O(1) (Head ke pehle naya node judta hai, koi shifting nahi)
        list.addFirst(5);

        // 3. addLast()  // O(1) (Direct tail node par attach ho jata hai)
        list.addLast(40);

        System.out.println(list); // [5, 10, 20, 30, 40]

        // 4. getFirst()  // O(1) (Direct head node ka data return karta hai)
        System.out.println(list.getFirst()); // 5

        // 5. getLast()  // O(1) (Direct tail node ka data return karta hai)
        System.out.println(list.getLast()); // 40

        // 6. removeFirst()  // O(1) (Head pointer ko agle node par shift karta hai)
        list.removeFirst();
        System.out.println(list); // [10, 20, 30, 40]

        // 7. removeLast()  // O(1) (Doubly LinkedList hone se tail.prev par jana instant hai)
        list.removeLast(); 
        System.out.println(list); // [10, 20, 30]

        // 8. contains(object)  // O(n) (Shuru se aakhiri tak ek-ek node check karna padta hai)
        System.out.println(list.contains(20)); // true

        // 9. size()  // O(1) (Internally tracked variable return karta hai)
        System.out.println(list.size()); // 3

        // 10. Traversal loop 
        for(Integer num : list){
            System.out.println(num);
        }
    }
}