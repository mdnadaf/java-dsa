// LC_142_Remove_Cycle_In_Linked_List.java

public class LC_142_Remove_Cycle_In_Linked_List {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Remove Cycle Using Floyd's Algorithm
    public static void removeCycle() {

        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        // Step 1: Detect Cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // No Cycle Found
        if (!cycle) {
            System.out.println("No Cycle Found");
            return;
        }

        // Step 2: Find Start of Cycle
        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove Cycle
        prev.next = null;

        System.out.println("Cycle Removed Successfully");
    }

    // Print Linked List
    public static void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create Cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        removeCycle();

        System.out.println("Linked List After Removing Cycle:");
        printList();
    }
}


/*
Problem: Remove Cycle in Linked List

Approach:
1. Detect cycle using Floyd's Cycle Detection Algorithm.
2. Move slow pointer to head.
3. Move slow and fast one step at a time.
4. Track previous node of fast pointer.
5. When slow == fast, cycle starting node is found.
6. Break the cycle using prev.next = null.

Time Complexity: O(n)
Space Complexity: O(1)

Pattern: Fast & Slow Pointer
Related Problems:
*/
