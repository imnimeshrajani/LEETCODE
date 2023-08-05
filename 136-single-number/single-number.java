class Solution {
    public int singleNumber(int[] nums) {
        int result = 0, i = 0;
        while (i< nums.length){
            result = result^nums[i++];
        }
        return result;
    }
}