class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return 2;
        }
        int index=1, count=1;
        for(int i=1;i<nums.length && index<nums.length;i++) {
            if(nums[i]!=nums[i-1]) {
                nums[index++] = nums[i];
                count=1;
            }else if (nums[i]==nums[i-1] && count<2) {
                nums[index++] = nums[i];
                count++;
            } 
        }
        return index;
    }
}