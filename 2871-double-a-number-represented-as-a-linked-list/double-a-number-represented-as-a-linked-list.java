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
    public ListNode doubleIt(ListNode head) {
        // ListNode l1 = reverse(head), l2  = l1;
        
        // ListNode dummy = new ListNode(0);
        // ListNode curr = dummy;
        // int carry = 0; 
        // while(l1 != null || l2 != null || carry == 1){
        //     int sum = 0;
        //     if(l1 != null){
        //         sum += l1.val;
        //         l1 = l1.next;
        //     }
        //     if(l2 != null){
        //         sum += l2.val;
        //         l2 = l2.next;
        //     }
        //     sum += carry;
        //     carry = sum/10;
        //     ListNode node = new ListNode(sum % 10);
        //     curr = curr.next = node;
        // }
        // return reverse(dummy.next);
        if(head.val > 4){
            head = new ListNode(0,head);
        }
        ListNode temp = head;
        while(temp!= null){
            temp.val = (temp.val * 2) % 10;
            if(temp.next != null && temp.next.val > 4){
                temp.val++;
            }
            temp = temp.next;
        }
        return head;
    }

    ListNode reverse (ListNode head) {
        ListNode prev = null, up = null;
        while(head != null) {
            up = head.next;
            head.next = prev;
            prev = head;
            head = up;
        }
        return prev;
    }
}