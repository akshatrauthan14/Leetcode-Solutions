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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null){
            return new int[] {-1,-1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        int i = 1;
        List<Integer> cric = new ArrayList<>();
        while(curr != null && curr.next != null){
            //compare for local max
            if(curr.val > prev.val && curr.val > curr.next.val){
                cric.add(i);
            }
            //compare for local min
            if(curr.val < prev.val && curr.val < curr.next.val){
                cric.add(i);
            }
            curr = curr.next;
            prev = prev.next;
            i++;
        }
        if(cric.size()<2){
            return new int[] {-1,-1};
        }
        // now we have critical pts, now calc min and max dist
        int min = Integer.MAX_VALUE;
        for(int in = 1; in<cric.size(); in++){
            min = Math.min(min,cric.get(in) - cric.get(in-1));
        }

        int max = cric.get(cric.size()-1) - cric.get(0);
        return new int[]{min,max};
    }
}
