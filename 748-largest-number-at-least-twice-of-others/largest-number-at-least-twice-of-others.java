class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = 0, index = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max){
                secMax = max;
                max = nums[i];
                index = i;
            } else if(nums[i]<max && nums[i]>secMax) secMax = nums[i];
        }
        return (max>=secMax*2)?index:-1;
    }
}