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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode end = list1;
        ListNode curr = list2;
        int cntNodes = 0;

        while (a > 1) {
            end = end.next;
            a -= 1;
            cntNodes += 1;
        }

        ListNode start = end;

        while (b > cntNodes) {
            end = end.next;
            b -= 1;
        }

        while (curr.next != null) {
            curr = curr.next;
        }

        start.next = list2;
        curr.next = end.next;

        return list1;
    }
}
