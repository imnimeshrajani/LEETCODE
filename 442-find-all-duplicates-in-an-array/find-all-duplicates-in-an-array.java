class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // List<Integer> ans = new ArrayList<>(nums.length);
        // ans.add(-1);
        // for(int i : nums) ans.add(-1);
        // for(int i : nums) ans.set(i, ans.get(i)+1);
        // for(int i = 0; i < ans.size(); i++) 
        //     if(ans.get(i) == 1) ans.set(i, i); 
        // for(int i = 0; i < ans.size(); i++) 
        //     if(ans.get(i) < 1) ans.remove(i--);
        // return ans;
        List<Integer> result = new ArrayList<>();
        for(int n = 0; n < nums.length; n++) {
            int val = Math.abs(nums[n]);
            if(nums[val - 1] < 0) result.add(val);
            else nums[val - 1] *= -1;
        }
        return result;
    }
}