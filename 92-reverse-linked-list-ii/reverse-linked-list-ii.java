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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        for(int i = 1;i<left;i++){
            temp = temp.next;
        }
        ListNode t1 = temp;
        ListNode h2 = temp.next;
        
        
        for(int i = 1;i<=right-left+1;i++){
            temp = temp.next;
        }
        ListNode t2 = temp;
        ListNode h3 = temp.next;
        t1.next = null;
        t2.next = null;
        

        rev(h2);
        t1.next = t2;
        h2.next = h3;
        return dummy.next;
 
    }

     void rev(ListNode head){
     ListNode p = null;
        ListNode c = head;
        ListNode f;
        while(c != null){
            f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
     }
          
    
}