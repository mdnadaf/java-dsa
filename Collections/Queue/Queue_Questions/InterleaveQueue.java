/*
=================================================
INTERLEAVE THE FIRST HALF OF THE QUEUE WITH
THE SECOND HALF
(GFG)
=================================================

Problem:

Input:

[1, 2, 3, 4, 5, 6]

Output:

[1, 4, 2, 5, 3, 6]

=================================================

Approach:

1. Store the first half of the queue
   into another queue.

2. Remove one element from first half.

3. Remove one element from second half.

4. Insert both alternatively.

=================================================

Time Complexity:

O(n)

=================================================

Space Complexity:

O(n)

=================================================
*/

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {

    public static void rearrangeQueue(Queue<Integer> q) {

        Queue<Integer> firstHalf = new LinkedList<>();

        int size = q.size();

        // Store first half
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Interleave
        while (!firstHalf.isEmpty()) {

            q.add(firstHalf.remove());

            q.add(q.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println("Before : " + q);

        rearrangeQueue(q);

        System.out.println("After  : " + q);
    }
}

/*
 * =================================================
 * Output:
 * 
 * Before : [1, 2, 3, 4, 5, 6]
 * 
 * After : [1, 4, 2, 5, 3, 6]
 * 
 */