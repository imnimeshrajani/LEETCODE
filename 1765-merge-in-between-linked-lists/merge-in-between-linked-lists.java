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
        ListNode ans = list1, start = ans, end = ans;
        while (--a > 0) start = start.next;
        while (b-- >= 0) end = end.next;
        start.next = list2;
        while (start.next != null) start = start.next;
        start.next = end;
        return ans;
    }
}