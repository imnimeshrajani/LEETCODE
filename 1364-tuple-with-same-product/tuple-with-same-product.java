class Solution {
    public int tupleSameProduct(int[] nums) {
        if(nums.length < 4) return 0;
        int ans = 0;
        Map<Integer, Integer> map = new  HashMap<>();
        for(int i = 0; i <nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int val = nums[i] * nums[j];
                map.put(val, map.getOrDefault(val, 0) + 1);
            }
        }
        for(int value : map.values()) {
            if(value > 1) ans += value * (value - 1) * 4;
        }
        return ans;

    }
}