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
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        //reverse, multiply by 2 and then reverse it again
        // multiply by 2 = add same no twice
        head = reverse(head);
        //new ans ll
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        //main logic
        ListNode temp = head;
        int carry = 0;
        while(temp != null){
            int val = temp.val;
            int sum = val + val + carry;
            int digit = sum % 10;
            //now add this digit to ll
            curr.next = new ListNode(digit);
            curr = curr.next;
            carry = sum / 10;
            temp = temp.next;
        }
        //check for 999 case
        if(temp == null && carry != 0){
            curr.next = new ListNode(carry);
        }
        //before reversing back, remove dummy node
        dummy = dummy.next;
        //reverse again
        head = reverse(dummy);
        return head;
    }
}
