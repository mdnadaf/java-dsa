public class LC_141_Linked_List_Cycle {

    public static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps

            if (slow == fast) {
                return true;           // Cycle detected
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

        // Creating nodes
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        // Linking nodes
        head.next = second;
        second.next = third;
        third.next = fourth;

        // Create cycle: 4 -> 2
        fourth.next = second;

        // Function call
        boolean result = hasCycle(head);

        System.out.println("Cycle Present : " + result);
    }
}