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
    int startPoint = 0;
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        helper(head, head, 0);
        return head;
    }
    ListNode helper(ListNode node, ListNode start, int endPoint) {
        if(node == null) return start;
        ListNode tempNode = helper(node.next, start, endPoint+1);
        if(++startPoint <= endPoint+1 && tempNode != node) {
            int value = tempNode.val;
            tempNode.val = node.val;
            node.val = value;
            
        }
        return tempNode.next;
    }
}