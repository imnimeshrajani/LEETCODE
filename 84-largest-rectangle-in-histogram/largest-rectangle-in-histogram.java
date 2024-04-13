class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 1) return heights[0];
        Deque<Integer> stack = new ArrayDeque<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            while (!stack.isEmpty() && (i == heights.length || heights[stack.peek()] >= heights[i])) {
                int h = heights[stack.pop()];
                int left = stack.isEmpty() ? -1 : stack.peek();
                maxArea = Math.max(maxArea, (i - 1 - left) * h);
            }
            stack.push(i);
        }

        return maxArea;
    }
}