/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while(a!= null && b != null){
            a = a.next;
            b = b.next;
        }
        //check for extra length
        if(a == null){
            //len of b is >= len of a
            int extraB = 0;
            while(b!= null){
                extraB++;
                b = b.next;
                
            }
            //shift headB too
            while(extraB-- >0){
                headB = headB.next;
            }
        } else{
            // b == null i.e. a is longer list
            int extraA = 0;
            while(a!= null){
                extraA++;
                a = a.next;
                
            }
            //shift headA too
            while(extraA-- >0){
                headA = headA.next;
            }
        }
        // now both lists have same no of nodes
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            } else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
