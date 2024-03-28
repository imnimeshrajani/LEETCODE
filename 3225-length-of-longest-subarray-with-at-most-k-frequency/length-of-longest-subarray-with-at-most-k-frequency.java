class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer>  map = new HashMap<>();
        int left = 0, right = 0, ans = 0;
        while(right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            if(map.get(nums[right]) > k) {
                while(map.get(nums[right]) > k) {
                    map.put(nums[left], map.get(nums[left++]) - 1);
                }
            }
            ans = Math.max(ans, right++ - left + 1);
        }
        return ans;
    }
}