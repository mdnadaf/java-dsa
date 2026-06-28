/*
=================================================
GENERATE BINARY NUMBERS
(GFG)
=================================================

Problem:

Given an integer n,
generate binary numbers
from 1 to n.

Example:

Input:

n = 5

Output:

1
10
11
100
101

=================================================

Approach:

1. Insert "1" into Queue.
2. Remove front string.
3. Store it in answer.
4. Append "0" and "1".
5. Insert both back into Queue.
6. Repeat n times.

=================================================

Time Complexity:

O(n)

=================================================

Space Complexity:

O(n)

=================================================
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static ArrayList<String> generateBinary(int n) {

        ArrayList<String> ans = new ArrayList<>();

        Queue<String> q = new LinkedList<>();

        q.add("1");

        while (n-- > 0) {

            String current = q.remove();

            ans.add(current);

            q.add(current + "0");

            q.add(current + "1");
        }

        return ans;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(generateBinary(n));
    }
}

/*
 * =================================================
 * Output:
 * 
 * [1, 10, 11, 100, 101]
 */