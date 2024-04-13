class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        List<Integer> ps = prevSmallerElements(heights), ns = nextSmallerElements(heights);
        for (int i = 0; i < heights.length; i++) {
            ans = Math.max(ans,(ns.get(i) - ps.get(i) - 1) * heights[i]);
        }
        return ans;
    }
    public List<Integer> prevSmallerElements(int[] h) {
        Stack<Integer> st = new Stack();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < h.length; i++) {
            while(!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();
            }
            ans.add(st.isEmpty() ? -1 : st.peek());
            st.push(i);
        }
        return ans;
    }
    public List<Integer> nextSmallerElements(int[] h) {
        Stack<Integer> st = new Stack();
        List<Integer> ans = new ArrayList<>();
        for(int i = h.length - 1; i >= 0; i--) {
            while(!st.isEmpty() && h[st.peek()] >= h[i]) {
                st.pop();
            }
            ans.add(0, st.isEmpty() ? h.length : st.peek());
            st.push(i);
        }
        return ans;
    }
}