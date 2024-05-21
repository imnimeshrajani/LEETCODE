class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        solve(nums, 0, new ArrayList<>());
        return ans;
    }
    void solve(int[] nums, int idx, List<Integer> list) {
        if(idx == nums.length) {
            ans.add(new ArrayList(list));
            return;
        }
        solve(nums, idx + 1, list);
        list.add(nums[idx]);
        solve(nums, idx + 1, list);
        list.remove(list.size() - 1);
    }
}