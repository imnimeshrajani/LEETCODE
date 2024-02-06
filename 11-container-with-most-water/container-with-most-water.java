class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1, water = 0;
        while (start < end) {
            if(height[start] < height[end]) {
                water = Math.max(water, height[start] * (end - start));
                start++;
            } else {
                water = Math.max(water, height[end] * (end - start));
                end--;
            }
        }
        return water;
    }
}