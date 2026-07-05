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
    public ListNode middleNode(ListNode head) {
        int size= 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;

        }
         ListNode mid = head;
        for(int i = 1;i<(size/2);i++){
            mid = mid.next;
        }
       
         if(size<=1){
             return head;
         }
        return mid.next;
       
    }
}