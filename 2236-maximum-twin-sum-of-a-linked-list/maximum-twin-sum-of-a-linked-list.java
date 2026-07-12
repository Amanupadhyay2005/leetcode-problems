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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

       ListNode head1 = slow.next;
       slow.next = null;

        
       head1 = reverse(head1);
       ListNode temp = head;
       ListNode temp2 = head1;
       int maxsum = 0;
       while(temp!=null){
        int sum = temp.val+temp2.val;
        maxsum = Math.max(sum,maxsum);
        temp = temp.next;
        temp2 = temp2.next;
       }

        return maxsum;
    }
      ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        ListNode forw = null;
        while(cur!=null){
            forw = cur.next;
            cur.next = pre;
            pre = cur;
            cur = forw;
        }
        return pre;

       }
}