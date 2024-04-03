class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int count = 2, position = 0;
        ListNode runner = head.next, start = head;
        
        while (runner != null) {
            if (++position == count) {
                if (count % 2 == 0) {
                    runner = start.next;
                    start.next = reverse(start.next, position);
                }
                
                position = 0;
                count++ ;
                start = runner;
            }
            runner = runner.next ;
        }
        
        if (position % 2 == 0 && start.next != null)
            start.next = reverse(start.next, position) ;
        
        return head ;
    }
    
    public ListNode reverse (ListNode start, int n) {
        ListNode prev = start, curr = prev, h = null ;
        
        while (n-- > 0) {
            curr = curr.next ;
            prev.next = h ;
            h = prev ;
            prev = curr ;
        }
        
        start.next = curr ;
        return h ;
    }
}