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
    public boolean isPalindrome(ListNode head) {
        StringBuilder real = new StringBuilder(), reverse = new StringBuilder();
        while (head != null) {
            real.append((char)('0' + head.val));
            reverse.insert(0, (char)( '0' + head.val));
            head = head.next;
        }
        return real.toString().equals(reverse.toString());
    }
}