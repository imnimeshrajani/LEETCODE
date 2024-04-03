class Solution {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        int groupNo = 2, nodeCount = 0 ;
        ListNode runner = head.next, start = head ;
        
        while (runner != null) {
            if (++nodeCount == groupNo) {
                if (groupNo % 2 == 0) {
                    runner = start.next ;
                    start.next = reverse(start.next, nodeCount) ;
                }
                
                nodeCount = 0 ;
                groupNo++ ;
                start = runner ;
            }
            runner = runner.next ;
        }
        
        if (nodeCount % 2 == 0 && start.next != null)
            start.next = reverse(start.next, nodeCount) ;
        
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