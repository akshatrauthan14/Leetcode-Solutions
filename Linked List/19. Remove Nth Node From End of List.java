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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode temp = head;
        ListNode ptr = head;
        //create gap of n btw 2 nodes
        int i = 1;
        while(i<=n){
            ptr = ptr.next;
            i++;
        }
        //edge case
        if(ptr == null){
            return head.next;
        }
        //move ptr till last node\
        while(ptr.next != null){
            ptr = ptr.next;
            temp = temp.next;
        }
        //skip node
        temp.next = temp.next.next;
        return head;
    }
}
