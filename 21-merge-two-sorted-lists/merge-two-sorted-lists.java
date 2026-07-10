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
    public ListNode mergeTwoLists(ListNode List1, ListNode List2) {
        ListNode dum = new ListNode(-1);
        ListNode temp = dum;
        while(List1 != null && List2 != null){
            if(List1.val >= List2.val){
                temp.next = List2;
                List2 = List2.next;
            }
                else{
                       temp.next = List1;
                       List1 = List1.next;
                }
                temp = temp.next;
            }
        

        if(List1 != null){
            temp.next = List1;
        }
        else{
            temp.next = List2;
        }
        return dum.next;
    }
}