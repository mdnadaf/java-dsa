import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // 1. add()  // O(1) Amortized (Average O(1), Worst Case O(n) jab array size double hota hai)
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list); // [Java, Python, C++]

        // 2. add(index, element)  // O(n) (Elements ko aage shift karna padta hai)
        list.add(1, "JavaScript");
        System.out.println(list); // [Java, JavaScript, Python, C++]

        // 3. get(index)  // O(1) (Direct index access)
        System.out.println("Element: " + list.get(2)); // Element: Python

        // 4. set(index, element)  // O(1) (Direct index par value replace hoti hai)
        list.set(0, "Spring");
        System.out.println(list); // [Spring, JavaScript, Python, C++]

        // 5. contains(object)  // O(n) (Shuru se aakhiri tak element dhoodna padta hai)
        System.out.println(list.contains("Python")); // true

        // 6. size()  // O(1) (Internally variable track rehta hai)
        System.out.println(list.size());  // 4

        // 7. remove(index)  // O(n) (Elements ko piche shift karna padta hai)
        list.remove(1);
        System.out.println(list); // [Spring, Python, C++]

        // 8. remove(object) // O(n) (Pehle element dhoodna + fir baki elements ko shift karna)
        list.remove("C++");
        System.out.println(list); // [Spring, Python]

        // 9. isEmpty() // O(1) (Sirf check karta hai size == 0 hai ya nahi)
        System.out.println(list.isEmpty()); // false

        // 10. Traversal loop  // O(n) (Har ek element ko ek-ek karke visit karna)
        for(String s : list){
            System.out.println(s);
        }

        // 11. clear() // O(n) (Saare elements ko null karke memory free karta hai)
        list.clear();
        System.out.println(list); // []
    }
}