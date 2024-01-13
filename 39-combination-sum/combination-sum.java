class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        helper(nums, target, new ArrayList<>(), 0);
        return ans;
    }
    public void helper(int[] nums, int target, List<Integer> list, int idx) {
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx == nums.length) return;
        if(nums[idx] <= target) {
            list.add(nums[idx]);
            helper(nums, target - nums[idx], list, idx);
            list.remove(list.size()-1);  
        } 
        helper(nums, target, list, idx + 1);
    }
}