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
    static ListNode findMid(ListNode head){
        //find midpt of LL
        ListNode temp = head;
        ListNode slow = temp;
        ListNode fast = temp;
        while(fast!=null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        //test cases
        if(head == null || head.next == null){
            return true;
        }
        //break LL at mid
        ListNode list2 = findMid(head);
        //separate l1 and l2
        ListNode temp = head;
        while(temp.next != list2){
            temp = temp.next;
        }
        temp.next = null; // as L2 is alr separated
        //reverse L2
        ListNode head2 = reverse(list2);
        //compare L1 and L2
        ListNode temp1 = head;
        ListNode temp2 = head2;
        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            } else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return true;
    }
}
