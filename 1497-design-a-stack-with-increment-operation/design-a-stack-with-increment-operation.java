class CustomStack {
    int arr[], idx = -1, maxSize = 0;

    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(idx < maxSize - 1) {
            arr[++idx] = x;
        }
    }
    
    public int pop() {
        return (idx != -1) ? arr[idx--] : -1;
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i < Math.min(k, idx + 1); i++) {
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */