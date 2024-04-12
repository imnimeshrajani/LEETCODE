class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1, leftMax = Integer.MIN_VALUE, rightMax = leftMax, ans = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            ans += (leftMax < rightMax) ? leftMax - height[left++] : rightMax - height[right--];
        }
        return ans;
    }
}