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
        ListNode pointer = head.next, nextNode = pointer;
        while(nextNode != null) {
            int sum = 0;
            while(nextNode.val != 0) {
                sum += nextNode.val;
                nextNode = nextNode.next;
            }
            pointer.val = sum;
            nextNode = nextNode.next;
            pointer.next = nextNode;
            pointer = pointer.next;
        }
        return head.next;
    }
}