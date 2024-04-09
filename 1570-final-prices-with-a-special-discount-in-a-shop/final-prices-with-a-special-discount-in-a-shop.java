class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i = 0; i < prices.length; i++)
            prices[i] = getPrice(i, prices[i], prices); 
        return prices;
    }

    public int getPrice(int i, int price, int[] prices){
        for(int j = i + 1; j < prices.length; j++)
            if(prices[j] <= prices[i])
                return price - prices[j];
        return price;
    }
    // public int[] finalPrices(int[] prices) {
        // Stack<Integer> stack = new Stack();
        // for (int i = 0; i < prices.length; i++) {
        // while (!stack.isEmpty() && prices[i] <= prices[stack.peek()])
        // prices[stack.pop()] -= prices[i];

        // stack.push(i);
        // }
        // return prices;
    // }
}