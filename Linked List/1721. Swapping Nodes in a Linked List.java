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
    public ListNode swapNodes(ListNode head, int k) {

        //k-1 jumps from start for first node
        //n-k jumps from head for last node then swap both
        ListNode first = head;
        for(int i = 1; i<=k-1; i++){
            first = first.next;
        }
        //to find the 2nd node to be swapped
        ListNode temp = first.next;
        ListNode second = head;
        while(temp!=null){
            temp = temp.next;
            second = second.next;
        }
        //now temp sits on the 2nd node to be swapped
        int d = first.val;
        first.val = second.val;
        second.val = d;
        return head;
    }
}
