class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i  : nums) {
            sum += i;
            int rem = sum % k;
            if(rem < 0) rem += k;
            ans += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}