// class MinStack {
//     Stack<int[]> stack = new Stack();
//     int minValue = Integer.MAX_VALUE; 

//     public MinStack() {}
    
//     public void push(int val) {
//         minValue = Math.min(minValue, val);
//         stack.push(new int[]{val, minValue});
//     }
    
//     public void pop() {
//         stack.pop();
//         minValue = stack.isEmpty() ? Integer.MAX_VALUE : stack.peek()[1];
//     }
    
//     public int top() {
//         return stack.peek()[0];
//     }
    
//     public int getMin() {
//         return minValue;
//     }
// }

class MinStack {

    private class Node{
        public int val;
        public int min;
        public Node next;

        public Node(int val, int min, Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }

    }

    Node head = null;

    public MinStack() {

    }
    
    public void push(int val) {
            head = new Node(val, (head == null) ? val : Math.min(head.min, val), (head == null) ? null : head);
        
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */