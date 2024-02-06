class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length-1, water = 0;
        while (start < end) 
            water = (height[start] < height[end]) ? Math.max(water, height[start] * (end - start++)) :
                    Math.max(water, height[end] * (end-- - start));
        return water;
    }
}