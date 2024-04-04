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
    public ListNode removeNodes(ListNode head) {
        ListNode ans = new ListNode(0), dummy = ans;
        while(head != null) {
            if(dummy.val < head.val) {
                if(ans.val < head.val){
                    ans = new ListNode(head.val);
                    dummy = ans;
                } else {
                    ListNode temp = ans;
                    while(temp.val >= head.val) temp = temp.next;
                    temp.val = head.val;
                    temp.next = null;
                    dummy = temp;
                }
            } else {
                
                dummy.next = new ListNode(head.val);
                dummy = dummy.next;
            }
            head = head.next;
        }
        return ans;
    }
}