/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = 0, sizeB = 0;
        ListNode tempA = headA, tempB = headB;
        while(tempA.next!=null){
            tempA = tempA.next;
            sizeA++;
        }
        while(tempB.next!=null){
            tempB = tempB.next;
            sizeB++;
        }
        int diff = Math.abs(sizeA - sizeB);
        if(sizeA > sizeB){
            while(diff!=0) {
                headA = headA.next;
                diff--;
            }
        } else {
            while(diff!=0) {
                headB = headB.next;
                diff--;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}