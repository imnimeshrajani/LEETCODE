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
        ListNode p1 = head, p2 = head;
        while(p2 != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }

        ListNode prevNode = null;
        while(p1 != null){
            ListNode nextNode = p1.next;
            p1.next = prevNode;
            prevNode = p1;
            p1 = nextNode;
        }
        p2 = head;
        while(prevNode != null){
            if(p2.val != prevNode.val) return false;
            p2 = p2.next;
            prevNode = prevNode.next;
        }
    return true;
    }
}