class Solution {
    public boolean check(int[] nums) {
        int chance = 1;
        if(nums[0] < nums[nums.length - 1]) chance--;
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) chance--;    
            if(chance < 0) return false;
        }
        return true;
    }
}