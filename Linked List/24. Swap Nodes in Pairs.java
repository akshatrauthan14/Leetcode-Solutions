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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        // dummy to update head of ll after swap
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        ListNode forw = head.next;
        while(curr != null && forw != null){
            //save start of next pair so that we don't lose the ll
            ListNode temp = forw.next;
            //swap
            prev.next = forw;
            curr.next = temp;
            forw.next = curr;
            //swapping is complete, now move all the 3 pointers
            prev = curr;
            curr = temp;
            if(curr != null){
                forw = curr.next;
            }
        }
        return dummy.next;
    }
}
