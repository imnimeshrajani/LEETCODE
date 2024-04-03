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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode ans = new ListNode(0), temp = ans;
        int carry = 0;
        while(l1 != null && l2 != null) {
            ListNode pos = new ListNode(0);
            // System.out.println("l1 : " + l1.val);
            // System.out.println("l2 : " + l2.val);
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            pos.val = sum % 10;
            temp.next = pos;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            ListNode pos = new ListNode(0);
            int sum = l1.val + carry;
            carry = sum / 10;
            pos.val = sum % 10;
            temp.next = pos;
            temp = temp.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode pos = new ListNode(0);
            int sum = l2.val + carry;
            carry = sum / 10;
            pos.val = sum % 10;
            temp.next = pos;
            temp = temp.next;
            l2 = l2.next;
        }
        if(carry != 0) {
            ListNode pos = new ListNode(carry);
            temp.next = pos;
        }
        return reverse(ans.next);
    }
    ListNode reverse(ListNode head) {
        ListNode prev = null, next;
        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}