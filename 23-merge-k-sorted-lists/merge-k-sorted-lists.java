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
    public ListNode mergeKLists(ListNode[] lists) {
         if (lists == null || lists.length == 0) {
            return null;
        }
        return mergesort(lists,0,lists.length-1);
    }
    public ListNode mergesort(ListNode[] ls,int low,int high){
        if(low==high)return ls[low];
        if(low+1==high)return merge(ls[low],ls[high]);
        int mid=(low+high)/2;
        ListNode left=mergesort(ls,low,mid);
        ListNode right=mergesort(ls,mid+1,high);
        return merge(left,right);
    }
    public ListNode merge(ListNode l,ListNode r){
        ListNode dum=new ListNode(-1);
        ListNode head=dum;
        while(l!=null && r!=null){
            if(l.val<r.val){
                dum.next=l;
                l=l.next;
                dum=dum.next;
            }
            else{
                dum.next=r;
                r=r.next;
                dum=dum.next;
            }
        }
        dum.next=(l!=null) ? l : r;
        return head.next;
    }
}