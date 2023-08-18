class Solution {
    public int majorityElement(int[] nums) {
       int ans = 1, max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], 1);
            else {
                map.put(nums[i], map.get(nums[i])+1);
                if (map.get(nums[i])>max) {
                    max = map.get(nums[i]);
                    ans = nums[i];
                }
            }
        }
        return ans;
    }
}