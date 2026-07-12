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
    public boolean isPalindrome(ListNode head) {
        // ArrayList<Integer> list = new ArrayList();
        // ListNode temp = head;
        // while(temp!=null){
        //     list.add(temp.val);
        //     temp = temp.next;          // brute force
        // }
        // int i = 0;
        // int j = list.size()-1;
        // while(i<j){
        //     if(list.get(i)!=list.get(j)) return false;
        //     i++;
        //     j--;
        // }
        // return true;

         


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

       while(temp2!=null){
        if(temp.val != temp2.val) return false;
        temp = temp.next;
        temp2 = temp2.next;
       }  
       return true;  

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