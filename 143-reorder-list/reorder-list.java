/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode mid = head, end = head, curr, prev = null, next, start;
        boolean isEven = false;
        while (end.next != null && end.next.next != null) {
            mid = mid.next;
            end = end.next.next;
        }
        curr = mid.next;
        mid.next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        curr = head;
        ListNode dummy = prev;
        while (curr != null && dummy != null) {
            ListNode temp = curr.next;
            curr.next = dummy;
            ListNode temp2 = dummy.next;
            dummy.next = temp;
            curr = temp;
            dummy = temp2;
        }
    }
}