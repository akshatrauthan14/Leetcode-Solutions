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
    public ListNode reverse(ListNode curr) {
        ListNode prev = null;

        while(curr != null) {
            ListNode next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        //reverse both
        l1 = reverse(l1);
        l2 = reverse(l2);
        //add both
        int carry = 0;
        while(l1 != null || l2 != null || carry>0){
            int a = (l1 == null) ? 0:l1.val;
            int b = (l2 == null) ? 0:l2.val;
            int sum = a + b + carry;
            int digit = sum % 10;
            carry = sum/10;
            curr.next = new ListNode(digit);
            curr = curr.next;
            //move forward
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        //disconnect dummy and reverse the list again and return
        return reverse(dummy.next);
    }
}
