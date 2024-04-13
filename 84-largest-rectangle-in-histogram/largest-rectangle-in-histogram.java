class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        int[] ps = prevSmallerElements(heights), ns = nextSmallerElements(heights);
        for (int i = 0; i < heights.length; i++) {
            // System.out.println("ps: " + ps[i] + " ns: " + ns[i]);
            ans = Math.max(ans,(ns[i] - ps[i] - 1) * heights[i]);
        }
        return ans;
    }
    int[] prevSmallerElements(int[] h) {
        int[] arr = new int[h.length];
        arr[0] = -1;
        for(int i = 1; i < h.length; i++) {
            int idx = i - 1;
            while(idx >= 0 && h[idx] >= h[i]) {
                idx = arr[idx];
            }
            arr[i] = idx;
        }
        return arr;
    }
    int[] nextSmallerElements(int[] h) {
        int[] arr = new int[h.length];
        arr[arr.length-1] = h.length;
        for(int i = h.length - 2; i >= 0; i--) {
            int idx = i + 1;
            while(idx < h.length && h[idx] >= h[i]) {
                idx = arr[idx];
            }
            arr[i] = idx;
        }
        return arr;
    }
}