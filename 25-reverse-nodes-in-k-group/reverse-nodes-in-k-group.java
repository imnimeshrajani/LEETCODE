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
    public ListNode reverseKGroup(ListNode head, int k) {
    //     int l = 0;
    // ListNode cur = head;
    // while (cur != null) {
    //     l++;
    //     cur = cur.next;
    // }
    // if (l < k) 
    //     return head;

    // int n = l/k;
    // ListNode pre = new ListNode(0), node, rem, ret = pre;
    // for (int i = 0; i < n; i++) {
    //     node = null;
    //     rem = head;
    //     for (int j = 0; j < k; j++) {
    //         ListNode nxt = head.next;
    //         head.next = node;
    //         node = head;
    //         head = nxt;
    //     }
    //     pre.next = node;
    //     rem.next = head;
    //     pre = rem;
    // }
    // return ret.next;
    ListNode preHead = new ListNode();
        preHead.next = head;

        ListNode prev = preHead, cur = head;
        while (cur != null) {
            ListNode n1 = cur, n2 = cur;
            int j = k;
            while (n2 != null && j > 0) {
                n1 = n2;
                n2 = n2.next;
                j--;
            }
            if (j > 0) break;

            n1.next = null;
            ListNode r = reverse(cur);
            prev.next = r;
            cur.next = n2;
            prev = cur;
            cur = n2;
        }

        return preHead.next;
    }

    ListNode reverse(ListNode cur) {
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}