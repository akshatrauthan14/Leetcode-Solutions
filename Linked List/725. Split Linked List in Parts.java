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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        
        //find length
        int n = 0;
        ListNode temp =  head;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        // size = n/k and extra nodes = n%k
        int base = n/k;
        int extra = n%k;
        ListNode prev = null;
        ListNode curr = head;
        for(int part = 0; part<k; part++){
            if(curr == null){
                ans[part] = curr;
                continue;
            }
            //insert curr in arr
            ans[part] = curr;
            
            //find width of curr sublist
            int width = base + (extra>0 ? 1:0);
            //decrement extra nodes
            extra--;
            for(int i = 1; i<= width; i++){
                prev = curr;
                curr = curr.next;
            }
            //separate the sublist
            prev.next = null;
            //now move to new iteration
            prev = null;
            
        }
        return ans;
    }
}
