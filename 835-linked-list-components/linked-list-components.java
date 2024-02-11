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
    public int numComponents(ListNode head, int[] nums) {
        boolean[] arr = new boolean[10001];
        for (int i : nums) arr[i] = true;
        int result = 0;
        while (head != null) {
            if (arr[head.val]) {
                while (head != null && arr[head.val]) head = head.next;
                result++;
            } else head = head.next;
        }
        return result;

        // Map<Integer, Integer> map = new HashMap<>();
        // int count = 0;
        // boolean flag = false;
        // for (int i : nums) map.put(i, 0);
        // while(head != null) {
        // if(map.containsKey(head.val)) {
        // if(!flag) count++;
        // flag = true;
        // } else flag = false;
        // head = head.next;
        // }
        // return count;
    }
}