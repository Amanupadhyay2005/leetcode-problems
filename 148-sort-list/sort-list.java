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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        head =  sortList(head);
        head2 = sortList(head2);
       
        return merge(head,head2);

    }
    static ListNode merge(ListNode head1,ListNode head2){
        ListNode dum = new ListNode(-1);
        ListNode temp = dum;
        ListNode i = head1;
        ListNode j = head2;
        while(i != null && j != null){
            if(i.val <= j.val){
                temp.next = i;
                i = i.next;
            }
            else{
                temp.next = j;
                j = j.next;
            }
            temp = temp.next;
        }
        if(i != null){
            temp.next = i;
        }
        else{
            temp.next = j;
        }
        return dum.next;

    }

}