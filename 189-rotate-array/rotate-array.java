class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k >= n) k = k % n;
        reverse(nums, 0, n - 1);
        // System.out.println(Arrays.toString(nums));
        reverse(nums, 0, k - 1);
        // System.out.println(Arrays.toString(nums));
        reverse(nums, k, n - 1);
        // System.out.println(Arrays.toString(nums));
    }
    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            nums[start] ^= nums[end];
            nums[end] ^= nums[start];
            nums[start] = nums[end] ^ nums[start];
            start++;
            end--;
        }
    }
}