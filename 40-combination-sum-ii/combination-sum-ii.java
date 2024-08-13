class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        helper(nums, 0, new ArrayList<Integer>(), target);
        return ans;
    }

    public void helper(int[] nums, int idx, List<Integer> list, int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if (idx == nums.length) return;

        if (nums[idx] <= target) {
            list.add(nums[idx]);
            helper(nums, idx + 1, list, target - nums[idx]);
            list.remove(list.size() - 1);
        }
        while (idx < nums.length - 1 && nums[idx] == nums[idx + 1]) idx++;
        helper(nums, idx + 1, list, target);
    }
}