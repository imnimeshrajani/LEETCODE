class Solution {
    public int minSwaps(int[] nums) {
        int size = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) size++;
        }
        if(size == 0 || size == 1 || size == nums.length) return 0;
        int swap = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] == 0) swap++;
        }
        if(swap == 0) return 0;
        int start = 0, end = size;
        int minSwap  = swap;
        while(end < nums.length){
            if(nums[start++] == 0) swap--;
            if(nums[end++]  == 0) swap++;
            minSwap = Math.min(minSwap, swap);
        }
        end = 0;
        while(start < nums.length){
            if(nums[start++] == 0) swap--;
            if(nums[end++]  == 0) swap++;
            minSwap = Math.min(minSwap, swap);
        }
        return minSwap;
    }
}