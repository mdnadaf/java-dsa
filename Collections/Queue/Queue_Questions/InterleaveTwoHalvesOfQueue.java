/*
=================================================
INTERLEAVE TWO HALVES OF A QUEUE
=================================================

Problem:

Input:

[1, 2, 3, 4]

Output:

[1, 3, 2, 4]

--------------------------------

Input:

[1, 2, 3, 4, 5, 6]

Output:

[1, 4, 2, 5, 3, 6]

=================================================

Approach:

1. Store first half of queue
   into another queue.

2. Remove one element from
   first half.

3. Remove one element from
   second half.

4. Insert them alternatively.

=================================================

Time Complexity:

O(n)

=================================================

Space Complexity:

O(n)

=================================================
*/

import java.util.Queue;
import java.util.LinkedList;

public class InterleaveTwoHalvesOfQueue {

    public static void interleave(Queue<Integer> q) {

        if (q.size() % 2 != 0) {

            System.out.println("Queue size must be even");
            return;
        }

        int n = q.size();

        Queue<Integer> firstHalf = new LinkedList<>();

        // Store first half
        for (int i = 0; i < n / 2; i++) {

            firstHalf.add(q.remove());
        }

        // Interleave both halves
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

        interleave(q);

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