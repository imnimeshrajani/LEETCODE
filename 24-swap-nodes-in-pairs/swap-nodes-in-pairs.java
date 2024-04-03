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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode ans = new ListNode(0);
        ans.next = head;
        head = ans;
        while(head.next != null && head.next.next != null) {
            ListNode next = head.next;
            ListNode up = head.next.next;
            head.next = up;
            next.next = up.next;
            up.next = next;
            head = head.next.next;
        }
        return ans.next;
    }
}