class Solution {
   public int longestSubarray(int[] nums) {
        int i = 0, j = 0, k = -1, big = Integer.MIN_VALUE, sum = 0;
        while(i<nums.length && j <nums.length){
            if(nums[i] == 0) {
                i++;
                j++;
                sum = 0;
            } else if(nums[j] == 0){
                if(k<0) k = j++;
                else {
                    i = k+1;
                    j = i;
                    k = -1;
                    if(sum>big) {
                        big = sum;
                    }
                    sum = 0;
                }
            } else sum += nums[j++];
        }
        if(Math.max(sum, big) == nums.length) return nums.length-1;
        return Math.max(sum, big);
    }
}