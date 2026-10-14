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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        //create a dummy node to make new list easier to insert into
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy; // to keep track of the head of the merged list
        while(temp1 != null && temp2 != null){
            if(temp1.val<=temp2.val){
                curr.next = temp1;
                temp1 = temp1.next;
            } else{
                curr.next = temp2;
                temp2 = temp2.next;
            }
            //update position of curr to next node
            curr = curr.next;
        }
        //if one list ends then keep loop running for other list till it ends
        if(temp1 == null){
            curr.next = temp2;
        } else{
            curr.next = temp1;
        }
        return dummy.next;
    }
}
