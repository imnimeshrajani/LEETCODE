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
        ListNode ans = new ListNode(), result = new ListNode(0, ans);
        while(head.next != null) {
            int sum = 0;
            while(head.next.val != 0) {
                sum += head.val;
                head = head.next;
            }
            sum += head.val;
            ans.val = sum;
            head = head.next;
            if(head.next != null) 
                ans = ans.next = new ListNode();
            
        }
        ans = null;
        return result.next;
    }
}