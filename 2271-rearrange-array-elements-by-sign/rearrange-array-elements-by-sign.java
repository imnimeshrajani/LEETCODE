class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];
        int pIndex = 0;
        int nIndex = 0;
        for (int num : nums) {
            if (num>0) pos[pIndex++] = num;
            else neg[nIndex++] = num;
        }
        pIndex = 0;
        nIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i%2==0) nums[i] = pos[pIndex++];
            else nums[i] = neg[nIndex++];
        }
        return nums;
    }
}