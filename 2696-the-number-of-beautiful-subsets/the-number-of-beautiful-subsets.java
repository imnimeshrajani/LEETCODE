class Solution {
    int ans = 0;
    public int beautifulSubsets(int[] nums, int k) {
        solve(nums, 0, new ArrayList<>(), k);
        return --ans;
    }
    void solve(int[] nums, int idx, List<Integer> list, int k) {
        if(idx == nums.length) {
            ans++;
            return;
        }
        solve(nums, idx + 1, list, k);
        boolean canAdd = true;
        for(int i : list) if(Math.abs(i - nums[idx]) == k) canAdd = false;
        if(canAdd) {
            list.add(nums[idx]);
            solve(nums, idx + 1, list, k);
            list.remove(list.size() - 1);
        }
    }
}