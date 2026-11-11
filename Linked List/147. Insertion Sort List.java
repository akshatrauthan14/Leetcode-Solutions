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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        ListNode prev = dummy; // where should node be inserted
        
        while(curr != null){
            ListNode forw = curr.next;
            //arrive at right place
            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }
            curr.next = prev.next;
            prev.next = curr;
            //reset pointers as we need to check pos from starting for every elemnt
            prev = dummy;
            curr = forw;
        }
        return dummy.next;
    }
}
