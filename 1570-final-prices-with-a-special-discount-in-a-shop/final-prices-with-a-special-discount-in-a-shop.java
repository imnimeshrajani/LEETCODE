class Solution {
    public int[] finalPrices(int[] prices) {
        // Stack<Integer> stack = new Stack();
        // for (int i = 0; i < prices.length; i++) {
        // while (!stack.isEmpty() && prices[i] <= prices[stack.peek()])
        // prices[stack.pop()] -= prices[i];

        // stack.push(i);
        // }
        // return prices;
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[prices.length];
        for (int i = prices.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && prices[s.peek()] > prices[i])
                s.pop();
            ans[i] = (s.isEmpty()) ? 0 : prices[s.peek()];
            s.push(i);
        }
        for (int i = 0; i < prices.length; i++) 
            ans[i] = prices[i] - ans[i];
        
        return ans;
    }
}