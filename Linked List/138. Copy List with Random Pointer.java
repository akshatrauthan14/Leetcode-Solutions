/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null ){
            return null;
        }
        //add clone nodes
        Node temp = head;
        while(temp != null){
            Node clone = new Node(temp.val);
            clone.next = temp.next;
            temp.next = clone;
            temp = clone.next;
        }
        //copy random pointer
        temp = head; 
        while(temp != null){
            Node old = temp;
            Node newNode = temp.next;
            if(old.random != null){
                //use the obs
                newNode.random = old.random.next;
            }
            temp = newNode.next;
        }
        //detach both lists
        temp = head;
        Node ans = head.next;
        while(temp != null){
            Node old = temp;
            Node clone = temp.next;
            //detach logic
            old.next = clone.next;
            if(clone.next != null){
                clone.next = clone.next.next;
            }
            temp = temp.next;
        }
        return ans;
    }
}
