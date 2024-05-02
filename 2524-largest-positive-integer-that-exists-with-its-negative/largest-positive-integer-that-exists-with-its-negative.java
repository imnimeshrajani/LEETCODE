class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i : nums) {
            if(set.contains((i * -1))) ans = Math.max(ans, Math.abs(i));
            else set.add(i);
        }
        return ans == 0 ? -1 : ans;
    }
}