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
    public ListNode reverseKGroup(ListNode head, int k) {
        //reverse first k nodes and rest would be handled by recursion
        ListNode temp = head;
        //find len
        int n = 0;
        while(temp!= null){
            n++;
            temp = temp.next;
        }
        if(n<k){
            return head;
        }
        //reverse first k nodes
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 1; i<=k; i++){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        //solve rem usinf rec
        ListNode recAns = reverseKGroup(curr,k);
        //join both lists
        head.next = recAns;
        return prev;
    }
}
