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
    //make new arr here so that its easily accessible
    ArrayList<Integer> nodes = new ArrayList<>();
    public Solution(ListNode head) {
        while(head!=null){
            nodes.add(head.val);
            head = head.next;
        }
    }
    //convert ll to arr and return value at random index
    public int getRandom() {
        int num = (int)(Math.random()*this.nodes.size());
        return this.nodes.get(num); 
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
