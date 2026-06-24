/*
=================================================
DEQUE USING COLLECTION FRAMEWORK
=================================================

Approach:
- Deque Interface use karenge.
- ArrayDeque class implement karegi.

Important Methods:

addFirst()
addLast()

removeFirst()
removeLast()

peekFirst()
peekLast()

=================================================

Time Complexity:

addFirst()    : O(1)
addLast()     : O(1)

removeFirst() : O(1)
removeLast()  : O(1)

peekFirst()   : O(1)
peekLast()    : O(1)

=================================================

Space Complexity:

O(n)

=================================================
*/

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeUsingCollectionFramework {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addFirst(10);

        dq.addLast(30);
        dq.addLast(40);

        System.out.println("Deque : " + dq);

        System.out.println("Front : "+ dq.peekFirst());

        System.out.println("Rear : "+ dq.peekLast());

        System.out.println("Removed Front : "+ dq.removeFirst());

        System.out.println("Removed Rear : "+ dq.removeLast());

        System.out.println("Deque : " + dq);
    }
}

/*
=================================================
Output:

Deque : [10, 20, 30, 40]

Front : 10

Rear : 40

Removed Front : 10

Removed Rear : 40

Deque : [20, 30]

=================================================
Dry Run:

addFirst(20)

[20]

--------------------------------

addFirst(10)

[10, 20]

--------------------------------

addLast(30)

[10, 20, 30]

--------------------------------

addLast(40)

[10, 20, 30, 40]

=================================================
Interview Notes:

Deque = Double Ended Queue

Insertion:
Front + Rear

Deletion:
Front + Rear

=================================================

Queue Methods:

offer()
poll()
peek()

=================================================

Deque Methods:

addFirst()
addLast()

removeFirst()
removeLast()

peekFirst()
peekLast()

*/