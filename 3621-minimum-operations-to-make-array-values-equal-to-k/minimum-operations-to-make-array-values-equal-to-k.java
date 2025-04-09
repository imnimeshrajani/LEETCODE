class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int val : nums) {
            if(val < k) return -1;
            if(val == k) continue;
            set.add(val);    
        }
        return set.size();
    }
}