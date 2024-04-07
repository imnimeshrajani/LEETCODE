class MinStack {
    Stack<int[]> stack = new Stack();
    int minValue = Integer.MAX_VALUE; 

    public MinStack() {}
    
    public void push(int val) {
        minValue = Math.min(minValue, val);
        stack.push(new int[]{val, minValue});
    }
    
    public void pop() {
        stack.pop();
        minValue = stack.isEmpty() ? Integer.MAX_VALUE : stack.peek()[1];
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return minValue;
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