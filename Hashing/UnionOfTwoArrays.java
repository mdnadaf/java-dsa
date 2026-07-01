/*
 * Union of Two Arrays
 *
 * Approach:
 * - Use a HashSet to store all unique elements
 *   from both arrays.
 * - HashSet automatically removes duplicates.
 *
 * Time Complexity : O(n + m)
 * Space Complexity: O(n + m)
 */

import java.util.HashSet;

public class UnionOfTwoArrays {

    public static int unionSize(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        // Add all elements from the first array
        for (int num : arr1) {
            set.add(num);
        }

        // Add all elements from the second array
        for (int num : arr2) {
            set.add(num);
        }

        // Number of unique elements
        return set.size();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3};

        System.out.println("Union Size = " + unionSize(arr1, arr2));
    }
}