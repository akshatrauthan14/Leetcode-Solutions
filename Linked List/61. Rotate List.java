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
    public ListNode rotateRight(ListNode head, int k) {
        //make the list into a cricular ll and break link at kth pos
        if(head == null || k==0){
            return head;
        }
        //make it circulare and find length
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        temp.next = head;
        //for essential rotations
        k = k % len;
        //break link and set forw var at next node to preserve ll
        temp = head;
        //move pointer k steps
        for(int i = 1 ; i<= len-k-1; i++){
            temp = temp.next;
        }
        ListNode forw = temp.next;
        temp.next = null;
        return forw;
    }
}
