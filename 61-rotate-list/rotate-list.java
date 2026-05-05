/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // 1. Compute the length and find the actual tail
        ListNode tail = head;
        int n = 1;
        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // 2. Link the tail to the head to make it circular
        tail.next = head;

        // 3. Find the new tail: (n - k % n - 1) steps from the beginning
        k = k % n;
        int stepsToNewTail = n - k - 1;
        ListNode newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // 4. The new head is the node after the new tail
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}