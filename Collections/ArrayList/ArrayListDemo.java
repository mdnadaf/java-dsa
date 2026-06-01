import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // 1. add()
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println(list); // [Java, Python, C++]

        // 2. add(index, element)
        list.add(1, "JavaScript");

        System.out.println(list); // [Java, JavaScript, Python, C++]

        // 3. get()
        System.out.println("Element: " + list.get(2)); // Element: Python

        // 4. set()
        list.set(0, "Spring");
        System.out.println(list); // [Spring, JavaScript, Python, C++]

        // 5. contains()
        System.out.println(list.contains("Python")); // true

        // 6. size()
        System.out.println(list.size());  // 4

        // 7. remove(index)
        list.remove(1);
        System.out.println(list); // [Spring, Python, C++]

        // 8. remove(object)
        list.remove("C++");
        System.out.println(list); // [Spring, Python]

        // 9. isEmpty()
        System.out.println(list.isEmpty()); // false

        // 10. Traversal
        for(String s : list){
            System.out.println(s);
        }

        // 11. clear()
        list.clear();

        System.out.println(list); // []
    }
}