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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while (true) {
            ListNode minNode = null;
            int minIdx = -1;

            for (int i = 0; i < lists.length; ++i) {
                ListNode currList = lists[i];
                if (currList == null)
                    continue;
                if (minNode == null || currList.val < minNode.val) {
                    minNode = currList;
                    minIdx = i;
                }
            }
            if (minNode == null)
                break;

            prev.next = minNode;
            prev = prev.next;

            lists[minIdx] = minNode.next;
        }
        return dummy.next;
    }
}