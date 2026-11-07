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
    public ListNode partition(ListNode head, int x) {
        //make 2 ll acc to pivot and at last merge them
        ListNode l1head = new ListNode(-1);
        ListNode l1tail = l1head;
        ListNode l2head = new ListNode(-1);
        ListNode l2tail = l2head;
        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                // separate this node 
                ListNode toInsert = temp;
                temp = temp.next;
                toInsert.next = null;
                //add it to l1
                l1tail.next = toInsert;
                l1tail = toInsert;
            } else {
                // separate this node 
                ListNode toInsert = temp;
                temp = temp.next;
                toInsert.next = null;
                //add it to l1
                l2tail.next = toInsert;
                l2tail = toInsert;
            }
        }
        l1tail.next = l2head.next;
        l2tail.next = null;
        //remove start dummy node
        l1head = l1head.next;
        return l1head;
    }
}
