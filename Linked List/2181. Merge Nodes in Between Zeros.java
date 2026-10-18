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
    public ListNode mergeNodes(ListNode head) {
        ListNode read = head.next;
        ListNode write = head;
        while(read != null){
            int sum = 0; //as we need sum = 0 for every iteration
            //move read till we hit another 0
            while(read.val != 0){
                sum += read.val;
                read = read.next;
            }
            //now we have sum value, hence update the write node
            write.val = sum;
            //move pointers forward
            write.next = read.next;
            
            read = read.next;
            write = write.next;
        }
        return head;
    }
}
