public class LC_141_Linked_List_Cycle {

    // Detect Cycle Using Floyd's Algorithm
    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps

            if (slow == fast) {
                return true;           // Cycle found
            }
        }

        return false;                  // No cycle
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle: 4 -> 2
        fourth.next = second;

        System.out.println("Cycle Present : " + hasCycle(head));
    }
}

/*
Problem : LC 141 - Linked List Cycle

Approach:
1. Use Slow and Fast Pointers.
2. Slow moves one step at a time.
3. Fast moves two steps at a time.
4. If cycle exists, slow and fast will meet.
5. If fast reaches null, no cycle exists.

Time Complexity : O(n)
Space Complexity : O(1)

Pattern : Fast & Slow Pointer
*/