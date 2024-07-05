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
        int[] ans = new int[] {-1, -1};
        if(head.next.next == null) return ans;
        int prev = head.val, first = 0, last = 0, idx = 1, min = Integer.MAX_VALUE;
        head = head.next;
        while(head.next != null) {
            if((head.val > prev && head.val > head.next.val) || (head.val < prev && head.val < head.next.val)) {
                if(first == 0) {
                    first = idx;
                } else {
                    if(last == 0) {
                        min = Math.min(min, idx - first);
                        last = idx;
                    } else {
                        min = Math.min(min, idx - last);
                        last = idx;
                    }
                }
            }
            prev = head.val;
            head = head.next;
            idx++;
        }
        ans[0] = min;
        ans[1] = last - first;
        return min == Integer.MAX_VALUE ? new int[] {-1, -1} : ans;
    }
}