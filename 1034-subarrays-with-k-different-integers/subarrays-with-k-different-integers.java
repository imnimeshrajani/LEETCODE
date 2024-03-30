class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // return helper(nums, k) - helper(nums, k - 1); 
        int[] numFreq = new int[nums.length+1];
        int distinct = 0, start = 0, minEnd = 0, total = 0;
        while (distinct == k || minEnd < nums.length) {
            while (distinct < k && minEnd < nums.length) 
			    if (numFreq[nums[minEnd++]]++ == 0) 
                distinct++;
            int maxEnd = minEnd;
            while (maxEnd < nums.length && numFreq[nums[maxEnd]] > 0)
			    maxEnd++;
            while (distinct == k) {
                if (numFreq[nums[start++]]-- == 1)
                distinct--;
                total += (maxEnd - minEnd + 1);
            }
        }
        return total;
    }
    int helper(int[] nums, int k) {
        int i = 0, j = 0, ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while(j < nums.length) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (map.size() > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0) 
                    map.remove(nums[i]);
                i++;
            }
            ans += j++ - i + 1;
        }
        return ans;
    }
}